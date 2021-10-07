import Cards.ICard;

import java.util.ArrayList;
import java.util.List;

public class DiscardDeck {

    private List<ICard> discardDeck = new ArrayList<>(112);

    public ICard getActiveCard(){
        return discardDeck.get(discardDeck.size()-1);
    }

    public int getDeckSize(){
        return discardDeck.size();
    }

    public List<ICard> getDiscardDeck(){
        return discardDeck;
    }

    public void addCard(ICard card){
        discardDeck.add(card);
    }
}
