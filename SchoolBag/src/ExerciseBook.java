import java.util.ArrayList;

public class ExerciseBook extends Book {


    protected String nameHomework;
    protected boolean doHomework;

    public ExerciseBook(String natbook, int numpage, String name) {
        super(natbook, numpage);
        this.nameHomework = name;
    }


    public void remove() {
        if (doHomework)
            nameHomework = nameHomework;
    }
public void setNameHomework(String homework){
        if ( !nameHomework.equals(homework)){
            nameHomework = homework;
        }
}


}

