package org.example.card;

import org.example.Player;
import org.example.Wallet;

public class Game {
    private Player player1;
    private Player player2;

    public static Game create(){
        Game game = new Game();
        game.player1 = new Player(Wallet.create());
        game.player2 = new Player(Wallet.create());
        return game;
    }

    public void play(){
        for(int i=0; i < 4; i++) {
            for(int j=0; j < 3; j++) {
                if (i % 2 == 0) {
                    player1.setUpCardsEmplror();
                    player2.setUpCardsSlave();
                } else {
                    player1.setUpCardsEmplror();
                    player2.setUpCardsSlave();
                }
                this.play1();
            }
        }
        System.out.println("Player1's wallet : " + player1.walletToString());
        System.out.println("Player2's wallet : " + player2.walletToString());
    }

    private void play1(){
        for(int k=0; k < 5; k++) {
            this.player1.battle(this.player2);
        }
        System.out.println("--------------------------------");
    }
}
