package HW6;

public class GameWinnerPrinter {
    public void printWinner(Player player) {
        System.out.println("Игрок " + player.getName() + " Победил!");
    }

    public void printDraw() {
        System.out.println("Ничья!");
    }
}
