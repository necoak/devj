package org.example.card;

import org.example.Player;
import org.example.Wallet;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimulatorMain {
    public static void main(String[] args) {
        System.out.println("Eカードシミュレート(奴隷側の勝率)");

        Player slavePlayer = new Player(Wallet.create(100000));
        Player emperorPlayer = new Player(Wallet.create(100000));

        for (int i = 0 ; i < 100000; i++) {
            slavePlayer.setUpCardsSlave();
            emperorPlayer.setUpCardsEmplror();
            for (int k=0; k < 5 ; k++){
                boolean result = slavePlayer.battle(emperorPlayer);
                if (result) break;
            }
            System.out.println("------------------------");
        }


        System.out.printf("奴隷側の期待値: %.3f \n", slavePlayer.getMoney() / 100000.0);
        System.out.printf("皇帝側の期待値: %.3f \n", emperorPlayer.getMoney() / 100000.0);

    }
}
