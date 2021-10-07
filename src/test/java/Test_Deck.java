

import Cards.ICard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Deck {

    @Test
    public void testDeckGeneration(){
//        Test for correct number of cards in deck
        Deck deck = new Deck();
        Assertions.assertEquals(112, deck.getDeckSize());

//        Test for correct number of cards of each colour
        int numOfBlue = 0;
        int numOfRed = 0;
        int numOfYellow = 0;
        int numOfGreen = 0;
        int deckSize = deck.getDeckSize();
        for(int i = 0; i < deckSize; i++){
            ICard card = deck.drawCard();
            switch(card.getCardColour()){
                case BLUE:
                    numOfBlue++;
                    break;
                case RED:
                    numOfRed++;
                    break;
                case YELLOW:
                    numOfYellow++;
                    break;
                case GREEN:
                    numOfGreen++;
                    break;
                case BLACK:
                    break;
            }
        }
        Assertions.assertEquals(26, numOfBlue);
        Assertions.assertEquals(26, numOfRed);
        Assertions.assertEquals(26, numOfYellow);
        Assertions.assertEquals(26, numOfGreen);
    }
}
