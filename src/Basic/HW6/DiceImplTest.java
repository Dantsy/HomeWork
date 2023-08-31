package Basic.HW6;

import org.junit.Assert;
import org.junit.Test;
public class DiceImplTest {
    @Test
    public void testRoll() {
        Dice dice = new DiceImpl();
        int result = dice.roll();

        Assert.assertTrue(result >= 1 && result <= 6);
    }
}
