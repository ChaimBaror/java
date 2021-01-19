package SkiSchool;

import java.util.ArrayList;
import java.util.Arrays;

public class SkiSchool {

    protected ArrayList<Student> studentArrayList;
    protected ArrayList<Lnstructor> lnstructorArrayList;
    protected ArrayList<Lesson> lessonsArrayList;

    public SkiSchool() {
    }

    public void sendSMSallStudent(String send) {
        for (Student student : studentArrayList) {
            System.out.println(student.PhoneSMS + send);
        }
    }

    public void sendSMSallLnstructor(String send) {
        for (Lnstructor lnstructor : lnstructorArrayList) {
            System.out.println(lnstructor.phoneSMS + send);
        }

    }

    public void sendSMSallStudentSnowdoard(String send) {
        for (Lesson lesson : lessonsArrayList) {
            if (lesson.type == LESSONS.SnowBoard)
                for (int i = 0; i < lesson.groupLessons.students.length; i++) {
                    System.out.println(lesson.groupLessons.students[i].PhoneSMS + send);
                }


            System.out.println(lesson.groupLessons.PhoneSMS + send);
        }
    }

    @Override
    public String toString() {
        return "SkiSchool{" +
                "studentArrayList=" + studentArrayList +
                ", lnstructorArrayList=" + lnstructorArrayList +
                ", lessonsArrayList=" + lessonsArrayList +
                '}';
    }
}
