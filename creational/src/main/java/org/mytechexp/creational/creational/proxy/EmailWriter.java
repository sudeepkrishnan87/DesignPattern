package org.mytechexp.creational.creational.proxy;

public interface EmailWriter extends Cloneable {
    void send(String msg);
    void setContent(String content);
}
