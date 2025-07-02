package org.mytechexp.creational.creational.prototype;

public class RealEmailWriter implements EmailWriter {
    private String content;

    @Override
    public void send(String to) {

        System.out.println("Sending email: " + to + " with content: " + content);
    }

    @Override
    public void setContent(String content) {

        this.content = content;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

