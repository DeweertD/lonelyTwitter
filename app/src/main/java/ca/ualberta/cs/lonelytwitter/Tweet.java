package ca.ualberta.cs.lonelytwitter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tweet {
//    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    private Date tweetDate;
    private String myTweet;

    public Tweet(){
        this.tweetDate = new Date();
        this.myTweet = "";
    }

    public Tweet(String message){
        this.tweetDate = new Date();
        this.myTweet = message;
    }

    public void setTweet(String message){
        this.myTweet = message;
    }

    public String getTweet(){
        return this.myTweet;
    }


    @Override
    public String toString(){
//        return dateFormat.format(this.tweetDate) + " : " + this.myTweet;
        return  this.myTweet;
    }
}
