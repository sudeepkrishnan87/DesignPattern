package org.mytechexp.structural.flyweight;

public class CreateForest {

    public static void main(String[] args) {
        for(int i=0;i<1000;i++)
        {
            Tree tree=TreeFactory.getTree(i,i,"Mahagony","Green","rough");
            tree.draw();
        }

    }
}
