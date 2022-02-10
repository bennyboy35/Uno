import Cards.*;
import Exceptions.DeckException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<ICard> _cardDeck = new ArrayList<>(112);

    public Deck() {
        generateDeck();
        Collections.shuffle(_cardDeck);
    }

    public Deck(List<ICard> cardPile){
        _cardDeck = cardPile;
    }

    public int getDeckSize(){
        return _cardDeck.size();
    }

    public ICard drawCard(){
        ICard card = _cardDeck.get(_cardDeck.size()-1);
        _cardDeck.remove(_cardDeck.size()-1);
        return card;
    }

    public void setDeck(List<ICard> importedDeck){
        if (_cardDeck.size() != 0){
            throw new DeckException("Deck must be empty to import");
        } else {
            _cardDeck = importedDeck;
        }
    }

    private void generateDeck() {
        for (ECardColour cardColour : ECardColour.values()) {
            if (cardColour == ECardColour.BLACK) {
                for (ECardType cardType : ECardType.values()) {
                    if (cardType.getWildStatus()) {
                        for (int i = 0; i < 4; i++) {
                            WildCard card = new WildCard(cardType);
                            _cardDeck.add(card);
                        }
                    }
                }
            } else {
                for (ECardType cardType : ECardType.values()) {
                    if (!cardType.getWildStatus()) {
                        for (int i = 0; i < 2; i++) {
                            ColouredCard card = new ColouredCard(cardType, cardColour);
                            _cardDeck.add(card);
                        }
                    }
                }
            }
        }
    }
}

