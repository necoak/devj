package org.example;

import org.example.card.Game;

public class Main {
    public static void main(String[] args) {
        System.out.println("Eカードのシミュレータ");
        Game mygame = Game.create();
        mygame.play();
    }
}
