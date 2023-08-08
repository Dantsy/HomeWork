package HomeWork6;

public class Main {
    public static void main(String[] args) {
        // Создание объектов для тестирования
        Dice dice = new DiceImpl();
        Player player1 = new Player("Алена");
        Player player2 = new Player("Вероника");

        // Создание игры и запуск
        Game game = new Game(dice, player1, player2);
        game.playGame();
    }
}
