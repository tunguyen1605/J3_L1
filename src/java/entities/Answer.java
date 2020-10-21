package entities;

/**
 *
 * @author Thaycacac
 */
public class Answer {

    public Answer(String answer, int correct, int questionid) {
        this.answer = answer;
        this.correct = correct;
        this.questionid = questionid;
    }

    private String answer;

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }
    private int correct;
    private int questionid;
    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }
    
    

    public Answer() {
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answer(String answer, int correct) {
        this.answer = answer;
        this.correct = correct;
    }

}
