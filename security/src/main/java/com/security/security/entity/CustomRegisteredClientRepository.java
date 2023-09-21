package com.security.security.entity;

import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;

public class CustomRegisteredClientRepository implements RegisteredClientRepository {

	@Override
	public void save(RegisteredClient registeredClient) {
		
		
	}

	@Override
	public RegisteredClient findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisteredClient findByClientId(String clientId) {
		// TODO Auto-generated method stub
		return null;
	}

}
