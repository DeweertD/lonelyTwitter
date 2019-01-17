import java.util.Date;

public class Sad extends Mood {
    private String myMood;

    public Sad(){
        this.myMood  = "Sad";
    }

    public Sad(Date setDate){
        super(setDate);
        this.myMood  = "Sad";
    }

    @Override
    public String toString(){
        return this.myMood;
    }
}
