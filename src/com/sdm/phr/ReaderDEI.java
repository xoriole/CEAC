package com.sdm.phr;

public class ReaderDEI {

    private String attribute;
    private String secretAttributeKey;
    private DatabaseClient dc;

    private String decrypt(CipherKeyPair input) {
        String key = dec(input.getKey(), secretAttributeKey);
        String plaintext = aes_dec(input.getCiphertext(), key);
        return plaintext;
    }

    public void getSection(String patient_id) {
        CipherKeyPair output = dc.retrieveSection(patient_id, attribute);
        String result = decrypt(output);
    }
    
    public void getSection(String patient_id, String author_id) {
        CipherKeyPair output = dc.retrieveSection(patient_id, attribute);
        String result = decrypt(output);
    }

    public String dec(String key, String w) {
        return null;
    }

    public String aes_dec(String key, String w) {
        return null;
    }

}
