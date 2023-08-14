package HW6;

public class Game {
    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;

    public Game(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        int player1Result = dice.roll();
        int player2Result = dice.roll();

        Player winner;
        if (player1Result > player2Result) {
            winner = player1;
        } else if (player2Result > player1Result) {
            winner = player2;
        } else {
            System.err.println("Ничья!");
            return;
        }

        winnerPrinter.printWinner(winner);
    }
}
