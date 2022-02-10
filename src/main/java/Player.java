import Cards.ICard;

import java.util.List;

public class Player {

    private final String _name;
    private final EPlayerColour _colour;
    private Hand _hand = new Hand();

    public Player(String name, EPlayerColour colour) {
        _name = name;
        _colour = colour;
    }

    public String getName() {
        return _name;
    }

    public EPlayerColour getColour() {
        return _colour;
    }

    public void addToHand(ICard card) {
        _hand.addCard(card);
    }

    public List<ICard> getHand() {
        return _hand.getHand();
    }
}
