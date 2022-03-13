package org.example;

import org.example.card.*;

public class Player {
    private Cards cards;
    private Wallet wallet;

    public Player(Wallet wallet){
        this.wallet = wallet;
    }

    public void setUpCardsEmplror(){
        this.cards = Cards.createEmperorSide();
    }

    public void setUpCardsSlave(){
        this.cards = Cards.createSlaveSide();
    }

    public boolean battle(Player player2) {
        Card myChoiceCard = choiceCard();
        Card vsChoiceCard = player2.choiceCard();
        boolean ret = true;

        if ((myChoiceCard instanceof CivilCard) && (vsChoiceCard instanceof CivilCard)){
            System.out.println("player1[Civil]  vs player2[Civil] : DRAW :  player1+-0 vs plyaer2+-0");
            ret = false;
        } else if ((myChoiceCard instanceof CivilCard) && (vsChoiceCard instanceof EmperorCard)) {
            System.out.println("player1[Civil]  vs player2[Emperor] : Lose : player1-1 vs plyaer2+1");
            this.wallet.minus(1);
            player2.wallet.plus(1);
        } else if ((myChoiceCard instanceof CivilCard) && (vsChoiceCard instanceof SlaveCard)) {
            System.out.println("player1[Civil]  vs player2[Slave] : Win  : player1+1 vs plyaer2-1");
            this.wallet.plus(1);
            player2.wallet.minus(1);
        }
        else if ((myChoiceCard instanceof EmperorCard) && (vsChoiceCard instanceof CivilCard)){
            System.out.println("player1[Emperor]  vs player2[Civil] : Win : player1+1 vs plyaer2-1");
            this.wallet.plus(1);
            player2.wallet.minus(1);
        } else if ((myChoiceCard instanceof EmperorCard) && (vsChoiceCard instanceof SlaveCard)){
            System.out.println("player1[Emperor]  vs player2[Slave] : Lose : player1-3 vs plyaer2+3");
            this.wallet.minus(3);
            player2.wallet.plus(3);
        } else if ((myChoiceCard instanceof SlaveCard) && (vsChoiceCard instanceof CivilCard)) {
            System.out.println("player1[Slave]  vs player2[Civil] : Lose : player1-1 vs plyaer2+1");
            this.wallet.minus(1);
            player2.wallet.plus(1);
        } else if ((myChoiceCard instanceof SlaveCard) && (vsChoiceCard instanceof EmperorCard)) {
            System.out.println("player1[Slave] vs player2[Emperor] : Win : player1+3 vs plyaer2-3");
            this.wallet.plus(3);
            player2.wallet.minus(3);
        }
        System.out.println(" --> " + this.walletToString() + " vs " + player2.walletToString());
        return ret;
    }

    private Card choiceCard() {
        Card myChoiceCard = cards.pop1();
        return myChoiceCard;
    }

    public String walletToString(){
        return wallet.toString();
    }

    public boolean isBroken(){
        return this.wallet.isEmpty();
    }
}
