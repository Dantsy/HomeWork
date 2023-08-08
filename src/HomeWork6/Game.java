package HomeWork6;

public class Game {
    private final Dice dice;
    private final Player player1;
    private final Player player2;

    public Game(Dice dice, Player player1, Player player2) {
        this.dice = dice;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        int roll1 = dice.roll();
        int roll2 = dice.roll();

        System.out.println("Игрок Алена сделал бросок: " + roll1);
        System.out.println("Игрок Вероника сделал бросок: " + roll2);

        if (roll1 > roll2) {
            System.out.println("Игрок Алена выигрывает!");
        } else if (roll1 < roll2) {
            System.out.println("Игрок Вероника выигрывает!");
        } else {
            System.out.println("Это ничья!");
        }
    }
}
// Интерфейс для кости
interface Dice {
    int roll();
}
