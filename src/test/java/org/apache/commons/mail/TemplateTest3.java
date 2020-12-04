package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

import javax.mail.internet.MimeMultipart;

public class TemplateTest3 extends TestCase{
    Email testEmail;

    public void setUp() {
        testEmail = new SimpleEmail();
    }

    public void testGetMailSessionWithSSLOnConnect() throws EmailException {
        System.out.println("Testing get mail session with ssl on connect");
        System.out.println("fxp933");

        testEmail.setHostName("b.com");
        testEmail.setSSLOnConnect(true);
        testEmail.getMailSession();
    }
}