package org.gamepals.gamepalsapi.account.passwordencryptor;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptor {
    public static String encrypt(String password) throws NoSuchAlgorithmException {
        byte[] digestedPassword = digestFromStringToBytes(password);
        return digestFromBytesToString(digestedPassword);
    }

    private static String digestFromBytesToString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for(byte b : bytes){
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

    private static byte[] digestFromStringToBytes(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        return digest.digest(password.getBytes(StandardCharsets.UTF_8));
    }
}
