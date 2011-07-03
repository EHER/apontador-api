package br.com.apontador.api.utils;

import org.junit.Assert;
import org.junit.Test;

public class ConfigurationTest {

	@Test
	public void testGetHost() {
		Assert.assertEquals("api.apontador.com.br", Configuration.getHost());
	}
	
	@Test
	public void testGetPath() {
		Assert.assertEquals("v1", Configuration.getPath());
	}
	
	@Test
	public void testGetKey() {
		Assert.assertEquals("my_key", Configuration.getKey());
	}

	@Test
	public void testGetSecret() {
		Assert.assertEquals("my_secret", Configuration.getSecret());
	}
}