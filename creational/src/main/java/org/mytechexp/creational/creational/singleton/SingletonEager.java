package org.mytechexp.creational.creational.singleton;

public class SingletonEager {
    private static SingletonEager instance=new SingletonEager();

    private SingletonEager(){

    }
    public static SingletonEager getInstance(){
        return instance;
    }
}
