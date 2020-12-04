package org.apache.commons.mail;

import junit.framework.TestCase;

public class TemplateTest1 extends TestCase {
    Email testEmail;

    public void setUp() {
        testEmail = new SimpleEmail();
    }

    public void testAddBcc() throws EmailException {
        System.out.println("testing addBcc method");
        System.out.println("fxp933");
        testEmail.addBcc("a@b.com");
        assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
    }

}
