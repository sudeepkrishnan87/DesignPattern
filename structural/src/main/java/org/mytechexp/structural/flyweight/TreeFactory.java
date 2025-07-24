package org.mytechexp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String,TreeType> treemap=new HashMap<>();
    public static Tree getTree(int x,int y,String name, String color, String nature)
    {
        if(null==treemap.get(name+color+nature))
        {
            TreeType treeType=new TreeType(name,color,nature);
            treemap.put(name+color+nature,treeType);
            return new Tree(x,y,treeType);
        }
        else
            return new Tree(x,y,treemap.get(name+color+nature));
    }
}
