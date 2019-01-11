import java.util.Date;

public abstract class Mood {
    private Date postDate;

    public Mood(){
        this.postDate = new Date();
    }

    public Mood(Date setDate){
        this.postDate = setDate;
    }

    public Date getDate(){
        return this.postDate;
    }

    public void setDate(Date setDate){
        this.postDate = setDate;
    }
}
