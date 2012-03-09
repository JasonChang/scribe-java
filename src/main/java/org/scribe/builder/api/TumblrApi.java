package org.scribe.builder.api;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;


public class TumblrApi extends DefaultApi10a{

	private static final String AUTHORIZATION_URL = "http://www.tumblr.com/oauth/authorize?oauth_token=%s";
	
	@Override
	public String getAccessTokenEndpoint(){
	return "http://www.tumblr.com/oauth/access_token";
	}

	@Override
	public String getRequestTokenEndpoint(){
	return "http://www.tumblr.com/oauth/request_token";
	}
	
	@Override
	public String getAuthorizationUrl(Token requestToken){
	return String.format(AUTHORIZATION_URL, requestToken.getToken());
	}

}
