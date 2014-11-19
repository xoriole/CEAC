package com.sdm.phr;

import java.util.Date;

public class WriterH {
	
	private String publicParameters;
	private DatabaseClient dc;

	private String generateKey(String plaintext){
		plaintext+=(new Date()).toString();
		//Randomly create key usable by AES. 
                // This is implemented as hash digest of plain text message.
		return CryptoUtil.getStringChecksum(plaintext, "SHA1");
	}
	
	public CipherKeyPair encrypt(String plaintext, String policy){
		String key = generateKey(plaintext);
		String ciphertext = aes_enc(plaintext, key);
		String enc_key = enc(publicParameters, policy, key);
		
		CipherKeyPair result = new CipherKeyPair(ciphertext,enc_key);
		return result;
	}
	
//	public void sendSection(String message,String patientID){
//		String policy = "patient";
//		CipherKeyPair ckp = encrypt(message,policy);
//		dc.insertSection(patientID, ckp, policy);
//	}
        
        public String aes_enc(String m, String key){
            return null;
        }
        
        public String enc(String param, String policy, String key){
            return null;
        }
	
}
