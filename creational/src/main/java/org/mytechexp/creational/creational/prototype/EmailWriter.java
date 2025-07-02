package org.mytechexp.creational.creational.prototype;

public interface EmailWriter extends Cloneable {
    void send(String msg);
    void setContent(String content);
}
