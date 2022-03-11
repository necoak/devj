package org.example;

public class Wallet {
    private Integer money;

    public  static Wallet create(){
        Wallet wallet = new Wallet();
        wallet.money = 6 * 1 + 6 * 5;
        return wallet;
    }

    public void plus(int pointcnt) {
        this.money += pointcnt;
    }

    public void minus(int pointcnt){
        this.money -= pointcnt;
    }

    @Override
    public String toString(){
        return money.toString();
    }
}
