package br.com.apontador.api.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApiClientTest {

	@Test
	public void testGetUri() {
		Client client = new Client();
		client.setHost("api.apontador.com.br");
		client.setKey("aaaaa");
		client.setSecret("bbbbb");
		client.setPath("v1");
		client.setAction("places/LBSID");

		assertEquals("http://aaaaa:bbbbb@api.apontador.com.br/v1/places/LBSID",
				client.getUri());
	}
}
