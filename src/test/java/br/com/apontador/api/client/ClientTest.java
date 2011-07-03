package br.com.apontador.api.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClientTest {

	@Test
	public void testGetUri() {
		Client client = new Client();
		client.setAction("places/LBSID");
		String uri = "http://my_key:my_secret@api.apontador.com.br/v1/places/LBSID";
		assertEquals(uri, client.getUri());
	}
}
