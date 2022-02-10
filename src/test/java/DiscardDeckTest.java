import Cards.ICard;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class DiscardDeckTest {

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
            assertEquals(cardList.get(i), discardList.get(i));
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
        List<ICard> discardList;
        discardList = discardDeck.getDiscardDeck();
        assertEquals(discardDeck.getActiveCard(), discardList.get(discardDeck.getDeckSize()-1));

        for (int i = 0; i < 5; i++){
            card = deck.drawCard();
            discardDeck.addCard(card);
        }
        assertEquals(discardDeck.getActiveCard(), discardList.get(discardDeck.getDeckSize()-1));

        for (int i = 0; i < 60; i++){
            card = deck.drawCard();
            discardDeck.addCard(card);
        }
        assertEquals(discardDeck.getActiveCard(), discardList.get(discardDeck.getDeckSize()-1));
    }
}
