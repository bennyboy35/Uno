import Cards.Card;
import Cards.ColouredCard;
import Cards.ECardColour;
import Cards.ECardType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HandTest {

    @DataProvider
    public Object[][] cards() {
        return new Object[][]{
                {new ColouredCard(ECardType.NINE, ECardColour.BLUE)},
                {new ColouredCard(ECardType.FIVE, ECardColour.RED)},
                {new ColouredCard(ECardType.SEVEN, ECardColour.GREEN)},
                {new ColouredCard(ECardType.REVERSE, ECardColour.YELLOW)},
                {new ColouredCard(ECardType.SKIP, ECardColour.BLUE)}
        };
    }

    @Test(dataProvider = "cards")
    public void testGetHandReturnsICardList() {
        Hand hand = new Hand();

    }
}
