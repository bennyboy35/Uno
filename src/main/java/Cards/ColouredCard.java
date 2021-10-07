package Cards;

public class ColouredCard extends Card implements IColouredCard{

//    ECardType cardType;
    ECardColour cardColour;

    public ColouredCard(ECardType cardType, ECardColour cardColour){
        this.cardType = cardType;
        this.cardColour = cardColour;
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
