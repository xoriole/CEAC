package com.sdm.phr;

public class WriterH {
	
	private String publicParameters;
	private DatabaseClient dc;

	private String generateKey(){
		String result = "";
		//Randomly create key usable by AES. Might be function for this already?
		return result;
	}
	
	private CipherKeyPair encrypt(String plaintext, String policy){
		String key = generateKey();
		String ciphertext = aes_enc(plaintext, key);
		String enc_key = enc(publicParameters, policy, key);
		
		CipherKeyPair result = new CipherKeyPair(ciphertext,enc_key);
		return result;
	}
	
	public void sendSection(String message, int patientID){
		String policy = "patient";
		CipherKeyPair ckp = encrypt(message,policy);
		dc.insertSection(patientID, ckp, policy);
	}
        
        public void sendSection(String message, int patientID, String policy){
		CipherKeyPair ckp = encrypt(message,policy);
		dc.insertSection(patientID, ckp, policy);
                System.out.println("SendSection ok");
	}
        
        public String aes_enc(String m, String key){
            return null;
        }
        
        public String enc(String param, String policy, String key){
            return null;
        }
	
}
