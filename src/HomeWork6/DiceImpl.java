package HomeWork6;

import java.util.Random;
// Интерфейс для кости
interface Dice {
    int roll();
}
public class DiceImpl implements Dice {
    private final Random random = new Random();

    @Override
    public int roll() {
        // Бросаем кость и возвращаем случайное значение от 1 до 6
        return random.nextInt(6) + 1;
    }
}
