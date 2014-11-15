package com.sdm.phr;

public class CipherKeyPair {
	
	private String key;
	private String ciphertext;
	
	public CipherKeyPair(String c, String k){
		ciphertext = c;
		key = k;
	}
	
	public String getCiphertext(){
		return ciphertext;
	}

	public String getKey(){
		return key;
	}
}
