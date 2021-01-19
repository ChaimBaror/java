package SkiSchool;

import java.util.ArrayList;

public class Lesson {

    static int numberIDLesson = 1000;
    protected LESSONS type;
    protected Group groupLessons;
    protected Private aPrivate;
    protected Lnstructor lnstructor;


    public Lesson() {
        numberIDLesson++;
    }

    public void thisLesson(LESSONS lessons)  {
        if (lessons == LESSONS.Ski) {
//            if (level == LEVEL.Beginner)
            System.out.println("This Lesson == Skiln Snow Plow + Ski Parallel");
//            if (level == LEVEL.Aduit)
//                System.out.println("This Lesson ==  Ski Parallel");
        }
//    public void thisLesson(LESSONS lessons) {
        if (lessons == LESSONS.SnowBoard)
            System.out.println("This Lesson == Stand Up ");
    }



    public void lnstructorOfLesson(Lnstructor lnstructor)  {
        if (lnstructor.type1 == LESSONS.SnowBoard || lnstructor.type2 == LESSONS.SnowBoard) {
            type = LESSONS.SnowBoard;
        }
        if (lnstructor.type1 == LESSONS.Ski || lnstructor.type2 == LESSONS.Ski){
            type = LESSONS.Ski;
    }
}

}
