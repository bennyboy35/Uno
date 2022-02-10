

import Cards.ICard;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeckTest {

    @Test
    public void testDeckGeneration(){
//        Test for correct number of cards in deck
        Deck deck = new Deck();
        assertEquals(deck.getDeckSize(), 112);

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
        assertEquals(numOfBlue, 26);
        assertEquals(numOfRed, 26);
        assertEquals(numOfYellow, 26);
        assertEquals(numOfGreen, 26);
    }
}
