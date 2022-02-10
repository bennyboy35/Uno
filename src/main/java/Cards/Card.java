package Cards;

public abstract class Card implements ICard{

    ECardType _cardType;
    ECardColour _cardColour;

    protected Card(ECardType cardType, ECardColour cardColour) {
        _cardType = cardType;
        _cardColour = cardColour;
    }

    public ECardType getCardType() {
        return _cardType;
    }

    public ECardColour getCardColour() {
        return _cardColour;
    }

    public boolean isWild() {
        return _cardType.getWildStatus();
    }

}
