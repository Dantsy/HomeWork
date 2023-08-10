package HW6;

public class Game {
    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;

    public Game(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        int resultPlayer1 = dice.roll();
        int resultPlayer2 = dice.roll();

        if (resultPlayer1 > resultPlayer2) {
            player1.setScore(player1.getScore() + 1);
            winnerPrinter.printWinner(player1);
        } else if (resultPlayer2 > resultPlayer1) {
            player2.setScore(player2.getScore() + 1);
            winnerPrinter.printWinner(player2);
        } else {
            winnerPrinter.printDraw();
        }
    }
}
