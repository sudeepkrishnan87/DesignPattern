package org.mytechexp.structural.flyweight;

import javax.sound.midi.Soundbank;

public class Tree {
    int x_cord;
    int y_cord;
    TreeType treeType;

    public Tree(int x_cord, int y_cord, TreeType treeType) {
        this.x_cord = x_cord;
        this.y_cord = y_cord;
        this.treeType = treeType;
    }
    public void draw(){
        System.out.println("name is "+treeType.name);
        System.out.println("color is"+treeType.color);
        System.out.println("Type is"+treeType.nature);
        System.out.println("Coordinates are "+x_cord+","+y_cord);
    }
}
