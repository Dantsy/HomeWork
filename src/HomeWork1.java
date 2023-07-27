import java.util.Scanner;
    public class HomeWork1 {
        public static void main(String[] args) {
            String[] questions = {
                    "Какой язык программирования мы изучаем?",
                    "Какая операционная система является самой популярной?",
                    "Какой язык программирования является самым популярным?"
            };

            String[][] options = {
                    {"Java", "Python", "C++"},
                    {"Linux", "Windows", "MacOS"},
                    {"Python", "Java", "C#"}
            };

            int[] answers = {1, 2, 1};

            int score = 0;
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < questions.length; i++) {
                System.out.println("Вопрос " + (i + 1) + ": " + questions[i]);
                for (int j = 0; j < options[i].length; j++) {
                    System.out.println((j + 1) + ". " + options[i][j]);
                }

                System.out.print("Введите номер правильного ответа: ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == answers[i]) {
                    score++;
                }
            }

            System.out.println("Результат: Вы ответили правильно на " + score + " из " + questions.length + " вопросов.");
        }
    }
