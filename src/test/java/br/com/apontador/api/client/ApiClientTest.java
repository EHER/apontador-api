package br.com.apontador.api.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sun.tools.internal.ws.processor.model.Response;

public class ApiClientTest {

	@Test
	public void testGetUri() {
		ApiClient client = new ApiClient();
		client.setHost("api.apontador.com.br");
		client.setKey("aaaaa");
		client.setSecret("bbbbb");
		client.setPath("v1");
		client.setAction("places/LBSID");

		assertEquals("http://aaaaa:bbbbb@api.apontador.com.br/v1/places/LBSID",
				client.getUri());
	}
}
