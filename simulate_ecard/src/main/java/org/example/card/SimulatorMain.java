package org.example.card;

import org.example.Player;
import org.example.Wallet;

public class SimulatorMain {
    public static void main(String[] args) {
        System.out.println("Eカードシミュレート(奴隷側の勝率)");

        Player slavePlayer = new Player(Wallet.create(1000));
        Player emperorPlayer = new Player(Wallet.create(1000));

        for (int i = 0 ; i < 1000; i++) {
            slavePlayer.setUpCardsSlave();
            emperorPlayer.setUpCardsEmplror();
            for (int k=0; k < 5 ; k++){
                boolean result = slavePlayer.battle(emperorPlayer);
                if (result) break;
            }
            System.out.println("------------------------");
        }

        System.out.println("奴隷側: " + slavePlayer.walletToString());
        System.out.println("皇帝側: " + emperorPlayer.walletToString());

    }
}
