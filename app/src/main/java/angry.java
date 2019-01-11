import java.util.Date;

public class Angry extends Mood {
    private String myMood;

    public Angry(){
        this.myMood = "Angry";
    }

    public Angry(Date setDate){
        super(setDate);
        this.myMood  = "Angry";
    }

    @Override
    public String toString(){
        return this.myMood;
    }
}
