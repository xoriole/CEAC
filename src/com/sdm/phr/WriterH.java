package com.sdm.phr;

import com.sdm.phr.cpabe.AESCoder;
import com.sdm.phr.cpabe.Cpabe;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriterH {

    private String publicParameters;
    
    private CipherKeyPair encrypt(String plaintext, String policy) {
        System.out.println("pt " + plaintext);
        System.out.println("pol " + policy);
        
        String key = String.valueOf(new Random().nextInt());
        byte[] ciphertext = null;
        try {
            ciphertext = AESCoder.encrypt(key.getBytes(), plaintext.getBytes());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        byte[] enc_key = enc(publicParameters, policy, key);
        
        CipherKeyPair result = new CipherKeyPair(ciphertext, enc_key);
        return result;
    }

    public void sendSection(String message, int patientID) {
        String policy = "patient";
        CipherKeyPair ckp = encrypt(message, policy);
        DatabaseClient.getInstance().insertSection(patientID, ckp, policy);
    }

    public void sendSection(String message, int patientID, int authorID,
            String policy) {
        CipherKeyPair ckp = encrypt(message, policy);
        DatabaseClient.getInstance().insertSection(patientID, authorID, ckp, policy);
    }

    public String aes_enc(String m, String key) {
        return null;
    }

    public byte[] enc(String param, String policy, String ptkey) {
        Cpabe test = new Cpabe();
        param = "/tmp/public_key";
        byte[] byteArrayEnc = null;
        try {
            byteArrayEnc = test.enc(param, policy, ptkey);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return byteArrayEnc;
    }

}
