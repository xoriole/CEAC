package com.sdm.phr;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class CipherKeyPair {
	
	private String key;
	private String ciphertext;
	
	public CipherKeyPair(byte[] c, byte[] k){
		ciphertext = Base64.encode(c);
		key = Base64.encode(k);
	}
	
	public String getCiphertext(){
            
                System.out.println(new String(ciphertext));
		return ciphertext;
	}

	public String getKey(){
                System.out.println(new String(key));
		return key;
	}
}
