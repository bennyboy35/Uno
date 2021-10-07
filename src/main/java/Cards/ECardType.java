package Cards;

public enum ECardType {

    ZERO(false),
    ONE(false),
    TWO(false),
    THREE(false),
    FOUR(false),
    FIVE(false),
    SIX(false),
    SEVEN(false),
    EIGHT(false),
    NINE(false),
    REVERSE(false),
    SKIP(false),
    DRAW_TWO(false),
    DRAW_FOUR(true),
    CHANGE_COLOUR(true);

    private boolean isWild;

    ECardType(boolean isWild) {
        this.isWild = isWild;
    }

    public boolean getWildStatus(){
        return isWild;
    }
}
