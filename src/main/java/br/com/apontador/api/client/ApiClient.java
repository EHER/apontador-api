package br.com.apontador.api.client;

import org.hamcrest.core.IsNull;

import br.com.caelum.restfulie.Response;
import br.com.caelum.restfulie.Restfulie;

public class ApiClient {
	private String host;
	private String path;
	private String key;
	private String secret;
	private String action;

	public String getUri() {
		return "http://" + getKey() + ":" + getSecret() + "@" + getHost() + "/"
				+ getPath() + "/" + getAction();
	}
	
	public Response get() {
		return Restfulie.at(getUri()).get();
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
