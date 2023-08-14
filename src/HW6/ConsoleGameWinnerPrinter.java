package HW6;

interface GameWinnerPrinter {
    void printWinner(Player winner);
}
public class ConsoleGameWinnerPrinter implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        System.out.println("Победитель: " + winner.getName());
    }
}
