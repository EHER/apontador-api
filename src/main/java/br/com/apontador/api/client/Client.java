package br.com.apontador.api.client;

import br.com.apontador.api.utils.Configuration;
import br.com.caelum.restfulie.Response;
import br.com.caelum.restfulie.Restfulie;

public class Client {
	private static final String HOST;
	private static final String PATH;
	private static final String KEY;
	private static final String SECRET;
	private String action;

	
	static {
		HOST = Configuration.getHost();
		PATH = Configuration.getPath();
		KEY = Configuration.getKey();
		SECRET = Configuration.getSecret();
	}
	
	public String getUri() {
		return "http://" + KEY + ":" + SECRET + "@" + HOST + "/"
				+ PATH + "/" + getAction();
	}
	
	public Response get() {
		return Restfulie.at(getUri()).get();
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
