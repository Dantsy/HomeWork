package Basic.HomeWork6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DiceImplTest {
    @Test
    void rollShouldReturnNumberBetween1And6() {
        DiceImpl dice = new DiceImpl();
        int roll = dice.roll();

        assertTrue(roll >= 1 && roll <= 6, "Бросок должен быть от 1 до 6");
    }
}
