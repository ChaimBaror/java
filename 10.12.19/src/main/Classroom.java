package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

    private String nameTheacher;
    private int numSutdent;
    private int[] scoreStudent = new int[10];


    public Classroom() {
        this.nameTheacher = nameTheacher;
        this.numSutdent = 10;
        this.scoreStudent = scoreStudent;
    }

    public void setGrades(int[] x) throws Exception {
        for (int i = 0; i < numSutdent; i++) {
            this.scoreStudent[i] = x[i];
        }
        if (x.length > numSutdent)
            throw new Exception("There is only an array for "+ numSutdent +" numbers");
    }

    public int setScore(int scors) throws Exception {
        if (scors > 100 || scors < 0) {
            throw new Exception("Try again to enter a number between 1 and 100 ");
        } else
            return scors;
    }

    // score student for index
    public int scoreStu(int x) throws Exception {
        return scoreStudent[x];
    }

    public String getNameTheacher() {
        return nameTheacher;
    }

    public void setNameTheacher(String nameTheacher) {
        this.nameTheacher = nameTheacher;
    }
//    public void setScoreStudent(int student, int score) throws Exception {
//        scoreStudent[student] = score;
//    }

    @Override
    public String toString() {
        return "main.Classroom{" +
                "nameTheacher='" + nameTheacher + '\'' +
                ", numSutdent=" + numSutdent +
                ", scoreStudent=" + Arrays.toString(scoreStudent) +
                '}';
    }
}
