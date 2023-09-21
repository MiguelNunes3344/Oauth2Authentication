package com.security.security.config;

import java.util.UUID;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.client.JdbcRegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.settings.ClientSettings;


@Configuration
public class ClientStoreConfig {
	
	
	
	@Bean
	RegisteredClientRepository registeredClientRepository(DataSource dataSource) {
			var registeredClient = RegisteredClient.withId(UUID.randomUUID().toString())
				.clientId("client-server")
				.clientSecret("{noop}secret")
				.clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
				.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
		        .authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
				.redirectUri("http://127.0.0.1:8080/login/oauth2/code/client-server-oidc")
				.scope(OidcScopes.OPENID)
				.scope(OidcScopes.PROFILE)
				.scope(OidcScopes.EMAIL)
				.clientSettings(ClientSettings.builder().requireAuthorizationConsent(true).build())
				.build();
				JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
				var clients = new JdbcRegisteredClientRepository(jdbcTemplate);
				clients.save(registeredClient);
				return clients;	
	}
	
	
	
	
}
