package org.mytechexp.creational.creational.factory;

public class Factory {
    public static Logistics getInstance(String mode){
        if(mode=="road")
            return new Road();
        else if(mode=="air")
            return new Air();
        else
            return null;
    }
}
