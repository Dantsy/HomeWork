package Basic.HomeWork2;
public class Question {
    private String questionText;
    private String[] choices;
    private int correctAnswer;

    public Question(String questionText, String[] choices, int correctAnswer) {
        this.questionText = questionText;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }
    public String getQuestionText() {
        return questionText;
    }
    public String[] getChoices() {
        return choices;
    }
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
