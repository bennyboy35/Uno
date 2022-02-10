import Cards.ICard;

import java.util.ArrayList;
import java.util.List;

public class DiscardDeck {

    private final List<ICard> _discardDeck = new ArrayList<>(112);

    public ICard getActiveCard(){
        return _discardDeck.get(_discardDeck.size()-1);
    }

    public int getDeckSize(){
        return _discardDeck.size();
    }

    public List<ICard> getDiscardDeck(){
        return _discardDeck;
    }

    public void addCard(ICard card){
        _discardDeck.add(card);
    }
}
