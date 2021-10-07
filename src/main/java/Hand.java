import Cards.ICard;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<ICard> hand = new ArrayList<>(7);

    public List<ICard> getHand() {
        return hand;
    }

    public void addCard(ICard card){
        hand.add(card);
    }
}
