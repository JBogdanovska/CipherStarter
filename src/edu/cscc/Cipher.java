package edu.cscc;

/**
 * Cipher class - encodes and decodes using Caesar cipher
 * DO NOT USE for secret stuff
 * @author jbogdanovska
 * @version 1.0
 */

public class Cipher {
    public int key;
    private static char[] alphabet =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();

    /**
     * Constructor
     * @param key secret key for encode / decode range 1 to 25
     */

    public Cipher(int key) {
        this.key = key % 26;
    }

    /**
     * Getter
     * @return key
     */

    public int getKey() {
        return key;
    }

    /**
     * Encrypt plaintext using Carsar cipher
     * @param plaintext original text
     * @return cipher text
     */

    public String encode(String plaintext) {
        String ciphertext = null;
        if (plaintext != null && !plaintext.isBlank()) {
            char[] parr = plaintext.trim().toLowerCase().toCharArray();
            char[] carr = new char[parr.length];
            for (int i=0; i<parr.length; ++i) {
                if (Character.isLetter(parr[i])) {
                    carr[i] = alphabet[((parr[i] - 'a' + key)%26)];
                } else {
                    carr[i] = parr[i];
                }
            }
            ciphertext = new String(carr);
        }
        return ciphertext;
    }

    public String decode(String ciphertext) {
        String plaintext = null;
        if (ciphertext != null && !ciphertext.isBlank()) {
            char[] carr = ciphertext.trim().toLowerCase().toCharArray();
            char[] parr = new char[carr.length];
            for (int i=0; i<carr.length; ++i) {
                if (Character.isLetter(carr[i])) {
                    parr[i] = alphabet[((carr[i] - 'a' - key+26)%26)];
                } else {
                    parr[i] = carr[i];
                }
            }
            plaintext = new String(parr);
        }
        return plaintext;
    }
}
