package com.endurance.aspect;

/**
 * Created by harish on 12/7/17.
 */
public class Test {
    public static void main(String args[]) throws Exception{
        security s=new security();
        System.out.println("Encrypted string:" + s.encrypt("Hello"));
        String encryptedText = s.encrypt("Hello");
        System.out.println("Decrypted string:" + s.decrypt(encryptedText));
    }
}
