package HomeWork6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GameTest {
    @Test
    void playGameShouldDeclarePlayer1AsWinnerIfRoll1IsGreaterThanRoll2() {
        // Создание объектов для тестирования
        Dice dice = new DiceImpl();
        Player player1 = new Player("Алена");
        Player player2 = new Player("Вероника");

        // Создание игры
        Game game = new Game(dice, player1, player2);

        // Имитация броска костей, где roll1 > roll2
        game.playGame();

        // Проверка, что игрок 1 объявляется победителем
        assertEquals("Игрок Алена выиграл!", getStandardOutContent(), "Игрок Алена объявлен победителем");
        assertEquals("", getStandardErrContent(), "Никаких ошибок возникать не должно");
    }

    @Test
    void playGameShouldDeclarePlayer2AsWinnerIfRoll2IsGreaterThanRoll1() {
        // Создание объектов для тестирования
        Dice dice = new DiceImpl();
        Player player1 = new Player("Алена");
        Player player2 = new Player("Вероника");

        // Создание игры
        Game game = new Game(dice, player1, player2);

        // Имитация броска костей, где roll1 < roll2
        game.playGame();

        // Проверка, что игрок 2 объявляется победителем
        assertEquals("Игрок Вероника выиграл!", getStandardOutContent(), "Игрок Вероника объявлен победителем");
        assertEquals("", getStandardErrContent(), "Никаких ошибок возникать не должно");
    }

    // Вспомогательный метод для получения содержимого System.out
    private String getStandardOutContent() {
        return null;
    }

    // Вспомогательный метод для получения содержимого System.err
    private String getStandardErrContent() {
        return null;
    }
}
