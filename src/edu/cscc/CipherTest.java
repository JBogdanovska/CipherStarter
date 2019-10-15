package edu.cscc;

import org.junit.Assert;

import static org.junit.Assert.*;

public class CipherTest {

    @org.junit.Test
    public void encode() {
        Cipher cipher = new Cipher(3);
        Assert.assertTrue("mdcc".equals(cipher.encode("jazz")));
        Assert.assertTrue("mdcc".equals(cipher.encode("   jazz   ")));
        Assert.assertTrue("mdcc".equals(cipher.encode("Jazz")));
        Assert.assertTrue("mdcc!".equals(cipher.encode("Jazz!")));
    }

    @org.junit.Test
    public void decode() {
        Cipher cipher = new Cipher(3);
        Assert.assertTrue("jazz".equals(cipher.decode("mdcc")));
    }
}