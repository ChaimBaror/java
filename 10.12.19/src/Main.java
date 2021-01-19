
import main.Classroom;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        int count = 0;
        System.out.println("Enter name theachr:");
        String thea = scan.next();
        classroom.setNameTheacher(thea);
        System.out.println("Enter number students :");
        int num = scan.nextInt();

        int[] grades = new int[num];

        while (count < num) {
            System.out.println("Enter grade " + (count + 1) + " score per student");
            try {
                grades[count] = classroom.setScore(scan.nextInt());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            count++;
        }

        try {
            classroom.setGrades(grades);

            System.out.println(classroom.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println(classroom.toString());

    }
}