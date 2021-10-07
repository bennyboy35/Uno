import Cards.*;
import Exceptions.DeckException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<ICard> cardDeck = new ArrayList<>(112);

    public Deck() {
        generateDeck();
        Collections.shuffle(cardDeck);
    }

    public Deck(List<ICard> cardPile){
        this.cardDeck = cardPile;
    }

    public int getDeckSize(){
        return cardDeck.size();
    }

    public ICard drawCard(){
        ICard card = cardDeck.get(cardDeck.size()-1);
        cardDeck.remove(cardDeck.size()-1);
        return card;
    }

    public void setDeck(List<ICard> importedDeck){
        if (cardDeck.size() != 0){
            throw new DeckException("Deck must be empty to import");
        } else {
            this.cardDeck = importedDeck;
        }
    }

    private void generateDeck() {
        for (ECardColour cardColour : ECardColour.values()) {
            if (cardColour == ECardColour.BLACK) {
                for (ECardType cardType : ECardType.values()) {
                    if (cardType.getWildStatus()) {
                        for (int i = 0; i < 4; i++) {
                            WildCard card = new WildCard(cardType);
                            cardDeck.add(card);
                        }
                    }
                }
            } else {
                for (ECardType cardType : ECardType.values()) {
                    if (!cardType.getWildStatus()) {
                        for (int i = 0; i < 2; i++) {
                            ColouredCard card = new ColouredCard(cardType, cardColour);
                            cardDeck.add(card);
                        }
                    }
                }
            }
        }
    }
}

