import java.util.Scanner;

public class Utils {
    public static double pi = Math.PI;
    public static Scanner scan = new Scanner(System.in);

    public static String getString() {
        System.out.println("Enter string: ");
        String str = scan.next();
        return str;

    }

    public static int gatInteger() {
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        return num;
    }

    public static double Circled(double diameter) {
        return pi * diameter;

    }

}
