package edu.cscc;

/**
 * Exercise cipher class
 */

public class Main {

    public static void main(String[] args) {
	    String str = "The quick brown fox jumped over the lazy dog.";
	    Cipher cipher = new Cipher(10);
	    System.out.println("Plaintext: "+str);
	    str = cipher.encode(str);
        System.out.println("Ciphertext: "+str);
        str = cipher.decode(str);
        System.out.println("Plaintext: "+str);
    }
}
