package org.mytechexp.creational.creational.proxy;

public class EmailWriterProxy implements EmailWriter {
    private RealEmailWriter realEmailWriter;
    /**
     * Getter for content, used for testing purposes.
     */
    public String getContent() {
        return content;
    }

    private String content;
    private boolean authorized;

    public EmailWriterProxy(boolean authorized) {
        this.authorized = authorized;
        this.realEmailWriter = new RealEmailWriter();
    }

    @Override
    public void send(String to) {
        if (authorized) {
            realEmailWriter.setContent(content);
            realEmailWriter.send(to);
        } else {
            System.out.println("Access denied: Not authorized to send email.");
        }
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        EmailWriterProxy clone = new EmailWriterProxy(this.authorized);
        clone.setContent(this.content);
        return clone;
    }
}

