package org.mytechexp.creational.creational.singleton;

public class SingletonThread {

    private static SingletonThread instance;

    private SingletonThread(){}

    public static synchronized SingletonThread getInstance(){
        if(instance==null){
            instance=new SingletonThread();
        }
        return instance;
    }
}
