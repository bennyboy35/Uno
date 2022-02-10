import Cards.ICard;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<ICard> _hand = new ArrayList<>(7);

    public List<ICard> getHand() {
        return _hand;
    }

    public void addCard(ICard card){
        _hand.add(card);
    }
}
