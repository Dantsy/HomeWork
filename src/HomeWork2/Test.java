package HomeWork2;
import java.util.Scanner;
public class Test {
    private Question[] questions;
    private int score;
    public Test(Question[] questions) {
        this.questions = questions;
    }
    public void runTest() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] choices = question.getChoices();
            for (int i = 0; i < choices.length; i++) {
                System.out.println((i + 1) + ". " + choices[i]);
            }
            System.out.print("Введите ответ (1-" + choices.length + "): ");
            int answer = scanner.nextInt();
            if (answer == question.getCorrectAnswer()) {
                score++;
                System.out.println("Правильно!");
            } else {
                System.out.println("Неправильно!");
            }
        }
        System.out.println("Результат: " + score + "/" + questions.length);
    }
}
