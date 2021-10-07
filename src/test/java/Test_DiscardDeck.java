import Cards.ICard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_DiscardDeck {

    @Test
    public void testDeckImport(){
        Deck deck = new Deck();
        DiscardDeck discardDeck = new DiscardDeck();
        ICard card = deck.drawCard();

        List<ICard> cardList = new ArrayList<>();
        for (int i = 0; i < 5; i++){

            cardList.add(card);
            discardDeck.addCard(card);
            card = deck.drawCard();
        }
        List<ICard> discardList = discardDeck.getDiscardDeck();
        for (int i = 0; i < cardList.size()-1; i++){
            Assertions.assertEquals(discardList.get(i), cardList.get(i));
        }
    }

    @Test
    public void testActiveCard(){
        Deck deck = new Deck();
        DiscardDeck discardDeck = new DiscardDeck();
        ICard card = deck.drawCard();
        for (int i = 0; i < 5; i++){
            card = deck.drawCard();
            discardDeck.addCard(card);
        }
        List<ICard> discardList = new ArrayList<>();
        discardList = discardDeck.getDiscardDeck();
        Assertions.assertEquals(discardList.get(discardDeck.getDeckSize()-1), discardDeck.getActiveCard());

        for (int i = 0; i < 5; i++){
            card = deck.drawCard();
            discardDeck.addCard(card);
        }
        Assertions.assertEquals(discardList.get(discardDeck.getDeckSize()-1), discardDeck.getActiveCard());

        for (int i = 0; i < 60; i++){
            card = deck.drawCard();
            discardDeck.addCard(card);
        }
        Assertions.assertEquals(discardList.get(discardDeck.getDeckSize()-1), discardDeck.getActiveCard());
    }
}
