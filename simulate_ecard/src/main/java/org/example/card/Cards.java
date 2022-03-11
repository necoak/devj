package org.example.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cards {
    private List<Card> cardList;

    public static Cards createEmperorSide(){
        Cards cards = new Cards();
        cards.cardList.add(new EmperorCard());
        return cards;
    }

    public static Cards createSlaveSide(){
        Cards cards = new Cards();
        cards.cardList.add(new SlaveCard());
        return cards;
    }

    private Cards(){
        cardList = new ArrayList<>();
        for (int i=0; i < 4; i++ ) {
            cardList.add(new CivilCard());
        }
    }

    public Card pop1(){
        Random random = new Random();
        int choiceIndx = random.nextInt(cardList.size());
        Card choiceCard = cardList.get(choiceIndx);
        cardList.remove(choiceIndx);
        return choiceCard;
    }
}
