package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

import javax.mail.internet.MimeMultipart;

public class TemplateTest2 extends TestCase{
    Email testEmail;

    public void setUp() {
        testEmail = new SimpleEmail();
    }

    public void testBuildMimeMessageFull() throws EmailException{
        System.out.println("Testing build mime message");
        System.out.println("fxp933");

        testEmail.setHostName("b.com");
        testEmail.setFrom("a@b.com");
        testEmail.addTo("c@b.com");
        testEmail.setSubject("a subject");
        testEmail.setCharset("utf-8");
        testEmail.setContent("abc", EmailConstants.TEXT_PLAIN);
        testEmail.addCc("d@b.com");
        testEmail.addBcc("e@b.com");
        testEmail.addReplyTo("f@b.com");
        testEmail.addHeader("header", "abc");
        testEmail.setContent(new MimeMultipart());

        testEmail.buildMimeMessage();
    }

}