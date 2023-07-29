package HomeWork2;
public class Main {
    public static void main(String[] args) {
        Question[] questions = new Question[3];
        questions[0] = new Question("Какой язык программирования мы изучаем?", new String[] {"Java", "Python", "C++"}, 1);
        questions[1] = new Question("Какая операционная система является самой популярной?", new String[] {"Linux", "Windows", "MacOS"}, 2);
        questions[2] = new Question("Какой язык программирования является самым популярным?", new String[] {"Python", "Java", "C#"}, 1);
        Test test = new Test(questions);
        test.runTest();
    }
}
