package com.security.security;






import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository extends RegisteredClientRepository {
	
	@Bean
	void save(RegisteredClient registeredClient);
	
	
}
