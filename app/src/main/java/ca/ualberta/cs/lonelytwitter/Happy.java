package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends Mood {
    private String myMood;

    public Happy(){
        this.myMood = "ca.ualberta.cs.lonelytwitter.Happy";
    }

    public Happy(Date setDate){
        super(setDate);
        this.myMood  = "ca.ualberta.cs.lonelytwitter.Happy";
    }

    @Override
    public String toString(){
        return this.myMood;
    }
}