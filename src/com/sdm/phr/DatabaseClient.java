package com.sdm.phr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseClient {

    private static DatabaseClient instance = new DatabaseClient();

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/phr";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";

    Connection con = null;
    Statement stmt = null;

    boolean setupError = false;

    private DatabaseClient() {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            setupError = true;
        }
    }
    
    public static DatabaseClient getInstance(){
        return instance;
    }
    public void exit(){
        try {
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addPatient(String fullName, String dob, String address,String masterKeyChecksum, String publicKeyChecksum){
        String sql = "insert into patient(full_name, date_of_birth, address, master_key_checksum, public_key_checksum) "
                + "values('"+fullName+"','"+dob+"','"+address+"','"+masterKeyChecksum+"','"+publicKeyChecksum+"');";
        System.out.println("sql:"+sql);
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean validatePatientLogin(String fullName,String masterKeyChecksum, String publicKeyChecksum){
        try {
            String sql = "select master_key_checksum, public_key_checksum from patient where full_name='"+fullName+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String dbMasterKeyChecksum = rs.getString("master_key_checksum");
                if(!masterKeyChecksum.equals(dbMasterKeyChecksum)){
                    return false;
                }
                String dbPublicKeyChecksum = rs.getString("public_key_checksum");
                if(!publicKeyChecksum.equals(dbPublicKeyChecksum)){
                    return false;
                }
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Map<String,Integer> getOrgnMap(){
        Map<String,Integer> orgnMap = new HashMap<String,Integer>();
        String sql = "select oid, name from organization";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
               int oid = rs.getInt("oid");
               String name = rs.getString("name");
               orgnMap.put(name,oid);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orgnMap;
    }
    
    public void addUser(String fullName, int orgnId, String attributes, String secretKeyChecksum){
        String sql = "insert into user(full_name, orgn_id, attributes, secret_key_checksum) "
                + "values('"+fullName+"','"+orgnId+"','"+attributes+"','"+secretKeyChecksum+"');";
        System.out.println("sql:"+sql);
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean validateUserLogin(String fullName, int orgnId, String secretKeyChecksum){
        try {
            String sql = "select secret_key_checksum from user where full_name='"+fullName+"' and orgn_id="+orgnId;
            System.out.println("sql:"+sql);
            System.out.println("secret key checksum:"+secretKeyChecksum);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String dbSecretKeyChecksum = rs.getString("secret_key_checksum");
                System.out.println("db secret key checksum:"+dbSecretKeyChecksum);
                if(!secretKeyChecksum.equals(dbSecretKeyChecksum)){
                    return false;
                }
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void insertSection(String patientID, CipherKeyPair ckp, String policy) {

        String SQLstatement = "INSERT INTO health_data VALUES('" + patientID + "', "
                + "SELECT COUNT(*) FROM health_data, '" + ckp.getCiphertext() + "', '" + policy + "', '" + ckp.getKey() + "');";
        //Send statement to database.
    }

    public CipherKeyPair retrieveSection(String patientID, String attribute) {
        String SQLstatement = "SELECT contents FROM health_data WHERE patientID='" + patientID + "' AND policy LIKE %" + attribute + "%;";
        //Send statement to database.

        CipherKeyPair result = new CipherKeyPair("", "");
        return result;
    }

}
