package entities;

import java.util.Date;
import java.util.ArrayList;

public class Question {

    private int id;
    private String question;
    private Date created;

    public Question() {
    }

    public Question(int id, String question, Date created) {
        this.id = id;
        this.question = question;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}
