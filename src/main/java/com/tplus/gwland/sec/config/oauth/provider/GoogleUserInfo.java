package com.tplus.gwland.sec.config.oauth.provider;

import java.util.Map;

public class GoogleUserInfo implements OAuth2UserInfo{

	private Map<String, Object> attributes;
	
    public GoogleUserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
	
    @Override
    public String getProviderId() {
        return (String) attributes.get("sub");
    }


    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

	@Override
	public String getProvider() {
		return "google";
	}
	@Override
	public String getAge() {
		return (String) attributes.get("age");
	}
	@Override
	public String getGender() {
		return (String) attributes.get("gender");
	}

	@Override
	public String getUsername() {
		return (String)attributes.get("name");
	}

}

