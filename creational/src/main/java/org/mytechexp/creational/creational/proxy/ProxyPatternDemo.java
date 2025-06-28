package org.mytechexp.creational.creational.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create a proxy with authorization
        EmailWriter emailWriter = new EmailWriterProxy(true);
        emailWriter.setContent("Hello, this is a test email!");
        emailWriter.send("Test@test.com");

        // Create a proxy without authorization
        EmailWriter unauthorizedWriter = new EmailWriterProxy(false);
        unauthorizedWriter.setContent("This should not be sent.");
        unauthorizedWriter.send("Unauthorized@test.com");

        // Invoking the clone object and proxying

        EmailWriterProxy original= new EmailWriterProxy(true);
        original.setContent("Sending Confidential data!!!");
        original.send("alien@nasa.com");

        EmailWriterProxy cloned=(EmailWriterProxy) original.clone();
        cloned.send("aliean@isro.com");
    }

    }
