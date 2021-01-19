import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        Shaep[]shaeps=new Shaep[3];
//        Circle circle = new Circle(4, "red", 4);
//        Square square = new Square(2,4,"belu",4);
//        Square square1= new Square(4,5,"yelow",7);
//        shaeps[0]=circle;
//        shaeps[1]=square;
//        shaeps[2]=square1;
//        System.out.println("How many shapes do you want to insert");
//        int num = scan.nextInt();
        int count = 0;
        ArrayList<Shaep> shaepArrayList = new ArrayList<>();
        while (true) {

            System.out.println("press 0 break /Press 1 for circle /Press 2 for square /press 3 for show square/  :");
            int press = scan.nextInt();
            if (press == 0) break;
            if (press == 1) {
                System.out.println("Enter color: ");
                String color = scan.next();
                System.out.println("number Frame thickness: ");
                int frame = scan.nextInt();
                System.out.println("number of radis: ");
                double radis = scan.nextDouble();
                Circle circle = new Circle(frame, color, radis);
                shaepArrayList.add(circle);
            }
            if (press == 2) {
                System.out.println("number Frame thickness: ");
                int frame = scan.nextInt();

                System.out.println("number of Square: ");
                int Square = scan.nextInt();
                System.out.println("Enter color: ");
                String color = scan.next();
                Square square1 = new Square(frame, color, Square);
                shaepArrayList.add(square1);

            }

            if (press == 3) {
                for (int i = 0; i < shaepArrayList.size(); i++) {
                    System.out.println(shaepArrayList.get(i).toString());
                    shaepArrayList.get(i).getArea();
                    shaepArrayList.get(i).getPerimeter();


                    if (shaepArrayList.get(i) instanceof Square) {
                        ((Square) shaepArrayList.get(i)).draw(((Square) shaepArrayList.get(i)).The_length_of_the_square_rib);

                    }
                }
            }

        }

    }

}
