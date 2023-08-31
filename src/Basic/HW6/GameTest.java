package Basic.HW6;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class GameTest {
    @Test
    public void testPlayGame_Player1Wins() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Dice dice = new TestDice(6, 1);
        GameWinnerPrinter winnerPrinter = new ConsoleGameWinnerPrinter();
        Game game = new Game(dice, winnerPrinter);

        Player player1 = new Player("Игрок 1");
        Player player2 = new Player("Игрок 2");

        game.playGame(player1, player2);

        System.setOut(System.out);

        if (!outputStream.toString().equals("Победитель: Игрок 1\n")) {
            System.err.println("testPlayGame_Player1Wins failed");
        }
    }

    @Test
    public void testPlayGame_Player2Wins() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Dice dice = new TestDice(1, 6);
        GameWinnerPrinter winnerPrinter = new ConsoleGameWinnerPrinter();
        Game game = new Game(dice, winnerPrinter);

        Player player1 = new Player("Игрок 1");
        Player player2 = new Player("Игрок 2");

        game.playGame(player1, player2);

        System.setOut(System.out);

        if (!outputStream.toString().equals("Победитель: Игрок 2\n")) {
            System.err.println("testPlayGame_Player2Wins failed");
        }
    }

    @Test
    public void testPlayGame_Draw() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Dice dice = new TestDice(3, 3);
        GameWinnerPrinter winnerPrinter = new ConsoleGameWinnerPrinter();
        Game game = new Game(dice, winnerPrinter);

        Player player1 = new Player("Игрок 1");
        Player player2 = new Player("Игрок 2");

        game.playGame(player1, player2);

        System.setOut(System.out);

        if (!outputStream.toString().equals("")) {
            System.err.println("testPlayGame_Draw failed");
        }
    }

    private static class TestDice implements Dice {
        private final int roll1;
        private final int roll2;

        public TestDice(int roll1, int roll2) {
            this.roll1 = roll1;
            this.roll2 = roll2;
        }

        @Override
        public int roll() {
            return (int) (Math.random() < 0.5 ? roll1 : roll2);
        }
    }
}
