package Cards;

public class WildCard  extends Card implements ICard{

    public WildCard(ECardType cardType){
        this.cardType = cardType;
        this.cardColour = ECardColour.BLACK;
    }

    @Override
    public ECardType getCardType() {
        return cardType;
    }

    @Override
    public ECardColour getCardColour() {
        return cardColour;
    }

    @Override
    public boolean isWild() {
        return cardType.getWildStatus();
    }
}
