package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Angry extends Mood {
    private String myMood;

    public Angry(){
        this.myMood = "ca.ualberta.cs.lonelytwitter.Angry";
    }

    public Angry(Date setDate){
        super(setDate);
        this.myMood  = "ca.ualberta.cs.lonelytwitter.Angry";
    }

    @Override
    public String toString(){
        return this.myMood;
    }
}
