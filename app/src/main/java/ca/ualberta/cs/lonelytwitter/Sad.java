package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends Mood {
    private String myMood;

    public Sad(){
        this.myMood  = "ca.ualberta.cs.lonelytwitter.Sad";
    }

    public Sad(Date setDate){
        super(setDate);
        this.myMood  = "ca.ualberta.cs.lonelytwitter.Sad";
    }

    @Override
    public String toString(){
        return this.myMood;
    }
}
