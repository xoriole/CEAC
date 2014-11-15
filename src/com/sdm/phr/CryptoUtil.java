package com.sdm.phr;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CryptoUtil {

    public static String getFileChecksum(String filename, String type) {
        String checksum = null;
        try {
            MessageDigest md = MessageDigest.getInstance(type);
            FileInputStream fis = new FileInputStream(filename);
            byte[] dataBytes = new byte[1024];

            int nread = 0;

            while ((nread = fis.read(dataBytes)) != -1) {
                md.update(dataBytes, 0, nread);
            };

            byte[] mdbytes = md.digest();

            //convert the byte to hex format
            StringBuffer sb = new StringBuffer("");
            for (int i = 0; i < mdbytes.length; i++) {
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            checksum = sb.toString();
        } catch (IOException ex) {
            Logger.getLogger(CryptoUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return checksum;
    }

}
