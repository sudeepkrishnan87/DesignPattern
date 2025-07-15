package org.mytechexp.structural.bridge;

public class Demo {
    public static void main(String[] args) {
        VideoPlayer player=new WebPlayer(new HDQuality());
        player.play("Avengers");


        VideoPlayer player2=new MobilePlayer(new Mobile3GPQuality());
        player2.play("Transformers");


    }
}
