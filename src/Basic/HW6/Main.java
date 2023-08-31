package Basic.HW6;

public class Main {
    public static void main(String[] args) {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new ConsoleGameWinnerPrinter();
        Game game = new Game(dice, winnerPrinter);

        Player player1 = new Player("Игрок 1");
        Player player2 = new Player("Игрок 2");

        game.playGame(player1, player2);
    }
}
