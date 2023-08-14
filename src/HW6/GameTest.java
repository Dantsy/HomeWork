package HW6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GameTest {
    @Test
    public void testPlayGame_Player1Wins() {
        Dice dice = new FixedDice(6); // Фиксированные значения кубика для тестирования
        GameWinnerPrinterStub winnerPrinter = new GameWinnerPrinterStub();
        Game game = new Game(dice, winnerPrinter);

        Player player1 = new Player("Алена");
        Player player2 = new Player("Вероника");

        game.playGame(player1, player2);

        assertEquals(1, player1.getScore());
        assertEquals(0, player2.getScore());
        assertTrue(winnerPrinter.isPrintWinnerCalled());
        assertFalse(winnerPrinter.isPrintDrawCalled());
    }

    @Test
    public void testPlayGame_Player2Wins() {
        Dice dice = new FixedDice(1); // Фиксированные значения кубика для тестирования
        GameWinnerPrinterStub winnerPrinter = new GameWinnerPrinterStub();
        Game game = new Game(dice, winnerPrinter);

        Player player1 = new Player("Алена");
        Player player2 = new Player("Вероника");

        game.playGame(player1, player2);

        assertEquals(0, player1.getScore());
        assertEquals(1, player2.getScore());
        assertTrue(winnerPrinter.isPrintWinnerCalled());
        assertFalse(winnerPrinter.isPrintDrawCalled());
    }

    @Test
    public void testPlayGame_Draw() {
        Dice dice = new FixedDice(3); // Фиксированные значения кубика для тестирования
        GameWinnerPrinterStub winnerPrinter = new GameWinnerPrinterStub();
        Game game = new Game(dice, winnerPrinter);

        Player player1 = new Player("Алена");
        Player player2 = new Player("Вероника");

        game.playGame(player1, player2);

        assertEquals(0, player1.getScore());
        assertEquals(0, player2.getScore());
        assertFalse(winnerPrinter.isPrintWinnerCalled());
        assertTrue(winnerPrinter.isPrintDrawCalled());
    }

    // Тест, который найдет ошибку, если при игре не выпадает результат от 1 до 6
    @Test
    public void testDiceRoll_ValidResult() {
        Dice dice = new DiceImpl();

        for (int i = 0; i < 1000; i++) {
            int result = dice.roll();
            assertTrue(result >= 1 && result <= 6);
        }
    }

    // Тест, который найдет ошибку, если при игре всегда выпадает одно и то же значение
    @Test
    public void testGamePlay_GameNotFixed() {
        Dice dice = new FixedDice(3); // Фиксированное значение кубика для тестирования
        GameWinnerPrinterStub winnerPrinter = new GameWinnerPrinterStub();
        Game game = new Game(dice, winnerPrinter);

        Player player1 = new Player("Алена");
        Player player2 = new Player("Вероника");

        game.playGame(player1, player2);

        assertEquals(1, player1.getScore());
        assertEquals(0, player2.getScore());
        assertTrue(winnerPrinter.isPrintWinnerCalled());
        assertFalse(winnerPrinter.isPrintDrawCalled());
    }

    // Stub класс для тестирования, чтобы проверить, вызывался ли метод printWinner и printDraw
    private static class GameWinnerPrinterStub extends GameWinnerPrinter {
        private boolean printWinnerCalled = false;
        private boolean printDrawCalled = false;

        @Override
        public void printWinner(Player player) {
            printWinnerCalled = true;
        }

        @Override
        public void printDraw() {
            printDrawCalled = true;
        }

        public boolean isPrintWinnerCalled() {
            return printWinnerCalled;
        }

        public boolean isPrintDrawCalled() {
            return printDrawCalled;
        }
    }

    // Dice имплементация, чтобы фиксировать результат броска для тестирования
    private static class FixedDice implements Dice {
        private final int fixedResult;

        public FixedDice(int fixedResult) {
            this.fixedResult = fixedResult;
        }

        @Override
        public int roll() {
            return fixedResult;
        }
    }
}
