import java.util.Date;

public class Happy extends Mood {
    private String myMood;

    public Happy(){
        this.myMood = "Happy";
    }

    public Happy(Date setDate){
        super(setDate);
        this.myMood  = "Happy";
    }

    @Override
    public String toString(){
        return this.myMood;
    }
}