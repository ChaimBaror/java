import java.sql.Array;
import java.time.*;
import java.util.*;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {




        System.out.println(" how mach caret object to array : ");
        int numcoreck = scan.nextInt();
        Robber robber1 = new Robber("nda", "ack", 28, 1.90, 88);
        Robber robber2 = new Robber("dan", "brack", 21, 1.70, 3);
        Robber robber3 = new Robber("zeavy", "kriminovsky", 22, 1.80, 1);
        Robber robber4 = new Robber("robin", "robbers", 20, 1.55, 9);
//       Sprinter[]arr = new Sprinter[4];
        Sprinter sprinter1 = new Sprinter("beny", "bar", 24, 70);
        Sprinter sprinter2 = new Sprinter("simi", "shlom", 43, 55);
        Sprinter sprinter3 = new Sprinter("aosin", "aotin", 14, 99);
        Sprinter sprinter4 = new Sprinter("linal", "massi", 44, 80);
        Cheetah cheetah1 = new Cheetah("namer", 2, "nana", 10, 30);
        Cheetah cheetah2 = new Cheetah("amer", 6, "bana", 15, 90);
        Cheetah cheetah3 = new Cheetah("mer", 5, "haan", 12, 80);
        ArrayList<Runable> array = new ArrayList<>();
        array.add(sprinter1);
        array.add(sprinter2);
        array.add(sprinter3);
        array.add(sprinter4);
        array.add(robber1);
        array.add(robber2);
        array.add(robber3);
        array.add(robber4);
        array.add(cheetah1);
        array.add(cheetah2);
        array.add(cheetah3);
//        arr[0]=sprinter1;
//        arr[1]=sprinter2;
//        arr[2]=sprinter3;
//        arr[3]=sprinter4;
        ArrayList<Sprinter> sprin = new ArrayList<>();
        ArrayList<Robber> robbe = new ArrayList<>();

        for (int i = 0; i < numcoreck; i++) {
            System.out.println("Tap from which type of object/press 1 for Robber /press 2 for sprinter / press 3 for cheetah");
            int press = scan.nextInt();

            if (press == 1) {

                System.out.println("Enter first name Robber");
                String name = scan.next();
                System.out.println("Enter last name Robber");
                String last = scan.next();
                System.out.println("Enter age Robber");
                int age = scan.nextInt();
                System.out.println("Enetr hi Robber");
                double hi = scan.nextDouble();
                System.out.println(" Enter number ckech Robber ");
                int ckech = scan.nextInt();

                Robber robber = new Robber(name, last, age, hi, ckech);
                array.add(robber);
            }
            if (press == 2) {
                System.out.println("Enter first name sprinter");
                String name = scan.next();
                System.out.println("Enter last name sprinter");
                String last = scan.next();
                System.out.println("Enter age sprinter");
                int age = scan.nextInt();
                System.out.println("Enetr avirch run sprinter");
                int run = scan.nextInt();
                Sprinter sprinter = new Sprinter(name, last, age, run);

                array.add(sprinter);

            }
            if (press == 3) {
                System.out.println("Enter name amimol");
                String names = scan.next();
                System.out.println("Enter cheetah name ");
                String name = scan.next();
                System.out.println("Enter cheetah age ");
                int age = scan.nextInt();
                System.out.println("Enter high cheetah");
                int high = scan.nextInt();
                System.out.println("Enter number animol cheetah eat");
                int num = scan.nextInt();


                Cheetah cheetah = new Cheetah(names, age, name, high, num);

                array.add(cheetah);

            }


        }
//        System.out.println(array.toString());


        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Robber) {
                robbe.add((Robber) array.get(i));
                System.out.println(
                        ((Robber) array.get(i)));
                ((Robber) array.get(i)).steal();


            }


            if (array.get(i) instanceof Sprinter) {

                sprin.add((Sprinter) array.get(i));

                System.out.println(
                        ((Sprinter) array.get(i)));

                ((Sprinter) array.get(i)).breath();

            }

            if (array.get(i) instanceof Cheetah) {
                System.out.println(
                        ((Cheetah) array.get(i)));

            }
            array.get(i).getrun();


        }

        System.out.println("before sort  " + Arrays.toString(sprin.toArray()));
        Collections.sort(sprin);
        System.out.println("after sort Arrangement by name " + Arrays.toString(sprin.toArray()));


        System.out.println("before sort " + Arrays.toString(robbe.toArray()));
        Collections.sort(robbe);
        System.out.println("after sort Several times he was caught " + Arrays.toString(robbe.toArray()));
    }


}
