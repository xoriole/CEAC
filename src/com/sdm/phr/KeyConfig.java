package com.sdm.phr;

import java.io.File;

public class KeyConfig {
    private static KeyConfig instance = new KeyConfig();
    private String patientMasterKeyPath = null;
    private String patientPublicKeyPath = null;
    private String userSecretKeyPath = null;
    
    private KeyConfig(){ 
        //setup default paths
        String keyPath = System.getProperty("user.home") + File.separator + ".phr";
        patientMasterKeyPath = keyPath + File.separator + "master.key";
        patientPublicKeyPath = keyPath + File.separator + "public.key";
    }
    public static KeyConfig getInstance(){
        return instance;
    }

    public String getPatientMasterKeyPath() {
        return patientMasterKeyPath;
    }

    public void setPatientMasterKeyPath(String patientMasterKeyPath) {
        this.patientMasterKeyPath = patientMasterKeyPath;
    }

    public String getPatientPublicKeyPath() {
        return patientPublicKeyPath;
    }

    public void setPatientPublicKeyPath(String patientPublicKeyPath) {
        this.patientPublicKeyPath = patientPublicKeyPath;
    }

    public String getUserSecretKeyPath() {
        return userSecretKeyPath;
    }

    public void setUserSecretKeyPath(String userSecretKeyPath) {
        this.userSecretKeyPath = userSecretKeyPath;
    }
    
    
}
