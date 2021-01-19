import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class test {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<Animil> zoo = new ArrayList<>();
        Horsh horsh = new Horsh("black", 4, 10);
        Fishs fishs = new Fishs("bule", 4, 60);
        SiamiCat siamiCat = new SiamiCat("whith", 4, 2.4, "milk");

        zoo.add(horsh);


        //
        Principal chiam = new Principal();
        Teacher david = new Teacher();
        Teacher yakov = new Teacher();
        Teacher baror = new Teacher();
        Sutdent person1 = new Sutdent();
        Sutdent person2 = new Sutdent();
        Sutdent person3 = new Sutdent();
        Sutdent person4 = new Sutdent();
        Sutdent person5 = new Sutdent();
        Sutdent person6 = new Sutdent();
        Sutdent person7 = new Sutdent();
        Sutdent person8 = new Sutdent();
        Sutdent person9 = new Sutdent();
        Sutdent person10 = new Sutdent();
        Sutdent person11 = new Sutdent();


        david.setFirstName("david");
        david.setLastName("dovid");
        david.setAddsass("Harav kook");


        chiam.setFirstName("chaim");
        chiam.setLastName("bar or");
        chiam.setEag(31);
        person1.setFirstName("david");

        person1.setLastName("baror");
        person1.setAvirch(90);
        person1.setEag(14);
        person1.setId(1111);
        person1.getPay();
        person2.setFirstName("bibi");
        person2.setLastName("netanyaou");
        person2.setId(2222);
        person2.setAvirch(100);
        person2.setEag(60);

        person2.getPay();

        person3.setFirstName("yakove");
        person3.setLastName("lol");
        person3.setId(3333);
        person3.setEag(18);
        person4.setFirstName("shalom");
        person4.setLastName("wili");
        person4.setId(4444);
        person4.setAvirch(100);
        person5.setFirstName("shool");
        person5.setId(5555);
        person5.setAvirch(90);
        person6.setFirstName("shira");
        person6.setPay(true);
        person7.setPay(true);
        person9.setPay(true);
        person6.setId(6666);
        person6.setAvirch(100);
        person7.setFirstName("golie");
        person7.setId(7777);
        person7.setAvirch(90);
        person8.setFirstName("chnoch");
        person8.setId(8888);
        person8.setAvirch(100);
        person9.setFirstName("ilan");
        person9.setId(9999);
        person9.setAvirch(90);
        person10.setFirstName("jone");
        person10.setId(101010);
        person10.setAvirch(100);
        person11.setFirstName("kone");
        person11.setId(111111);
        person11.setAvirch(90);
        person11.setEag(14);


        Grade grade1 = new Grade();
        Grade grade2 = new Grade();
        Grade grade3 = new Grade();
        Course course1 = new Course();
        Course course2 = new Course();
        Scool school = new Scool();

        ArrayList<Sutdent> grade1List = new ArrayList<Sutdent>();
        ArrayList<Sutdent> grade2List = new ArrayList<Sutdent>();
        ArrayList<Sutdent> grade3List = new ArrayList<Sutdent>();
        grade1List.add(person1);
        grade1List.add(person2);
        grade1List.add(person3);
        grade1List.add(person4);
        grade1List.add(person5);
        grade2List.add(person6);
        grade2List.add(person7);
        grade2List.add(person8);
        grade2List.add(person9);
        grade3List.add(person9);
        grade3List.add(person9);
        grade3List.add(person9);
        grade3List.add(person10);
        grade1.setSutdetList(grade1List);

        grade2.setSutdetList(grade2List);
        grade3.setSutdetList(grade3List);
        course1.setSutdetList(grade1List);
        grade1.setLavelClass(LAVELCLASS.A1);
        grade2.setLavelClass(LAVELCLASS.B2);
        grade3.setLavelClass(LAVELCLASS.C3);
        grade1.setMaxSutdent(3);
        grade2.setMaxSutdent(7);
        grade3.setMaxSutdent(7);
        grade1.setTeacher(baror);
        grade2.setTeacher(david);
        grade3.setTeacher(yakov);
        course1.setTeacher(baror);
        course1.setNameTyep("math");
        course2.setNameTyep("Computers");
        course2.setSutdetList(grade2List);


        grade2.setTeacher(david);

        ArrayList<Grade> grades1List = new ArrayList<>();
        ArrayList<Course> courses1List = new ArrayList<>();
        grades1List.add(grade1);
        grades1List.add(grade2);

        school.setSchoolroom(grades1List);
        school.setSchooltype(courses1List);
        school.addClass(grade3);
        school.setManager(chiam);
        school.setName("Selvir");
        school.setNumber_phone("0527158077");

//        school.sutdentIspay();


    }
}
///////////////////////////////////////////////////////////
//
//        long startTime, endTime;
//
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < NUM_MILOM; i++)
//            testFinal();
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println(" method with finals took " + endTime + " ms");
//
//
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < NUM_MILOM; i++)
//            testnomFinal();
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println(" method without finals took " + endTime + " Ms");
//
//
//        Book food = new Book();
//
//        Ingrediet ingrediet1 = new Ingrediet("pie apple ", 3, 1);
//        Ingrediet ingrediet2 = new Ingrediet("pie lemon", 4, 2);
//
//        Ingrediet ingrediet3 = new Ingrediet("tomeato", 5, 1);
//        Ingrediet ingrediet4 = new Ingrediet("banana", 2, 1);
//
//        ArrayList<Ingrediet> ingrediets = new ArrayList<>();
//        ingrediets.add(ingrediet1);
//        ingrediets.add(ingrediet2);
//
//        ArrayList<Ingrediet> ingrediets1 = new ArrayList<>();
//        ingrediets.add(ingrediet3);
//        ingrediets.add(ingrediet4);
//
//        Recipe nnn = new Recipe(ingrediets, new String[]{"pie,apple,egg,bamba"}, 3, "d", "a", 4);
//        Recipe n2 = new Recipe(ingrediets, "friut", 1, "f", "b", 5);
//        food.add(nnn);
//        food.add(n2);
//
//
//        Book food1 = new Book("avi", "live", "good");
//        Book food2 = new Book("chaim", "fanny", "fun");
//        ArrayList<Ingrediet> ingrediets2 = new ArrayList<>();
//        ingrediets2.add(new Ingrediet(" egg ", 30, 3));
//        food1.list.add(new Recipe(ingrediets2, new String[]{"soger", "solt"}, 5, "d", "a", 5));
//
//        food .Book( food1);
//
////
//
//
//        System.out.println(food.toString());
//        System.out.println(food1.toString());
//        System.out.println(food2.toString());
//
//
//        while (true) {
//
//            System.out.println("Insert 1 into Add Recipe / 2 to print Recipe /  Exit press 0: ");
//            int num = scan.nextInt();
//            if (num == 0) break;
//            if (num == 1) {
//                System.out.println("Enter new Ingrediet name :");
//                String n = scan.next();
//                System.out.println("Enter new price :");
//                int p = scan.nextInt();
//                System.out.println("Enter new amount :");
//                int a = scan.nextInt();
//                ArrayList<Ingrediet> ingrediets4 = new ArrayList<>();
//                Ingrediet ingredietEnter = new Ingrediet(n, p, a);
//                ingrediets4.add(ingredietEnter);
//
//                System.out.println("Enter list recipe :");
//                String list = scan.next();
//                System.out.println("Enter level:");
//                int level = scan.nextInt();
//                System.out.println("Enter Meat/Dairy/fur :");
//                String k = scan.next();
//                System.out.println("Enter Category :");
//                String category = scan.next();
//                System.out.println("Enter Stars :");
//                int stars = scan.nextInt();
//                Recipe recipe = new Recipe(ingrediets2, list, level, k, category, stars);
//                food.add(recipe);
//
//            }
//            if (num == 2) {
//                System.out.println("print all enter 1, of category enter 2 ");
//                int n = scan.nextInt();
//                if (n == 1) {
//                    food.print();
//                }

//                if (n == 2) {
//
//                    System.out.println("Put in 3 items");
//                    String item1 = scan.next();
//                    String item2 = scan.next();
//                    String item3 = scan.next();
//                    food.getArgs(item1, item2, item3);
//
//                }
////


//
//        food.printAll();


//*******************************************************************test***************************20/11/19************************
//    static char elivitor(int num) {
//        if (num > 3)
//            return 'a';
//        else
//            return 'b';
//    }
//
//    static void arraySum(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        if (sum >= 100 && sum <= 450)
//            System.out.println(sum);
//    }
//
//    static boolean menAig(int eig) {
//        if (eig <= 18 && eig >= 15)
//            return true;
//        else
//            return false;
//    }
//
//    static int miuzikPlay(int num) {
//        int count = 0;
//        int aig = 0;
//        for (int i = 0; i < num; i++) {
//            System.out.println("enter you aig: ");
//            int person = scan.nextInt();
//            if (menAig(person)) {
//                System.out.println("Enter how math tem lesen  ");
//                int tem = scan.nextInt();
//                if (tem > 3)
//                    count++;
//            }
////            System.out.println(count);
//        }
//        return count;
//    }
//
//    static void helth() {
//        int noGangrs = 0;
//        while (noGangrs <= 10) {
//            System.out.println("Enter name of food: ");
//            String food = scan.next();
//            System.out.println("Enter calori of food : ");
//            double calori = scan.nextInt();
//            if (calori < 130) {
//                System.out.println("Enter fat of food");
//                double fat = scan.nextInt();
//                if (fat < 5) {
//                    noGangrs++;
//                    System.out.println(food + " is good " + noGangrs);
//                }
//            }
//        }
//    }
//
//    static int array(int[][] arr, int k, int j) {
//        int result = 0;
//        for (int i = k; i < arr.length; i++) {
//            if (arr[k][j] == arr[k][j ++])
//                result = 1;
//        }
//        return result;
//    }
//
//    static void arrayBigger(int[][] arr) {
//        int count = 0;
//        System.out.println("Enter n of Row: ");
//        int row = scan.nextInt();
//        System.out.println("Enter n of index");
//        int index = scan.nextInt();
//        if (array(arr, row, index) == 1) {
//            count++;
//        }
//        System.out.println(count);
//    }
//
//
//    static void cumuntyPaly(int x) {
//        int nershmim = 0;
//        int[] arr =new int[3];
//
//        while (nershmim < x) {
//            System.out.println("Enter name");
//            String name = scan.next();
//            nershmim++;
//
//            System.out.println("Enter number of paly");
//            int num = scan.nextInt();
//            arr = Paly(num);
//            System.out.println(name);
//        }
//    }
//
//    static int[] Paly(int paly) {
//
//        int[] palycom = new int[3];
//        // room of seng,
//        palycom[0] = 0;
//        //room of drow,
//        palycom[1] = 0;
//        //room of teatron,
//        palycom[2] = 0;
//
//        switch (paly) {
//            case 0:
//                palycom[0]++;
//                break;
//            case 1:
//                palycom[1]++;
//                break;
//            case 2:
//                palycom[2]++;
//                break;
//        }
//        for (int i = 0; i < palycom.length; i++) {
//            System.out.println(palycom[i]);
//        }
//        numRoom(palycom);
//        return palycom;
//    }
//
//    static void numRoom(int[] palycom) {
//        // room of seng,
//        int roomSeng = palycom[0] / 40;
//        //room of drow,
//        int roomDrow = palycom[1] / 40;
//        //room of teatron,
//        int roomTeatron = palycom[2] / 40;
//        System.out.println("room of seng " + roomSeng);
//        System.out.println("room of drow " + roomDrow);
//        System.out.println("room of teatron" + roomTeatron);
//    }
//
//    static void day(int day) {
//        System.out.println("Enter number nershmim: ");
//        int x = scan.nextInt();
//        cumuntyPaly(x);
//
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        day(2);
////        helth();
////            System.out.println(elivitor(3));
////            System.out.println(menAig(19));
//        System.out.println(miuzikPlay(3));
//    }
//}
//    -------------------------18/11/19----------
//    static int add(int num1, int num2, char tab) {
//        int sum = 0;
//        if (tab == '+') {
//            sum = num1 + num2;
//        }
//        if (tab == '*') {
//            sum = num1 * num2;
//        }
//        if (tab == '/') {
//            sum = num1 / num2;
//        }
//        if (tab == '-') {
//            sum = num1 - num2;
//        }
//        if (tab == '%') {
//            sum = num1 % num2;
//        }
//        return sum;
//    }
//
//    static void Integers(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] / 10 != 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//
//    static void vacation() {
//
//        System.out.println("Enter  month 1 - 12 : ");
//        int month = scan.nextInt();
//        if (month == 7 || month == 8) {
//            System.out.println("vacation ");
//        } else
//            System.out.println("school");
//    }
//
//
//    static void scores(String x) {
//        int count = 0;
//        int StudentGood = 0;
//        int studentGarbeg = 0;
//        int[] score = new int[3];
//        for (int i = 0; i < 3; i++) {
//            System.out.println(String.format("The %d test score: ", (i + 1)));
//            score[i] = scan.nextInt();
//            if (score[i] >= 90 && score[i] <= 100) {
//                count++;
//            }
//        }
//        System.out.println(count + " tests that pass ");
//        if (count == 3) {
//            System.out.println(x + " is a Student  good " + score[0] + " " + score[1] + " " + score[2]);
//            StudentGood++;
//        } else {
//            System.out.println(x + " You are not allowed to participate " + score[0] + " " + score[1] + " " + score[2]);
//            studentGarbeg++;
//        }
//    }
//
//    static void student(int numStudent) {
//        for (int i = 0; i < numStudent; i++) {
//            System.out.println("enter name student  ");
//            String name = scan.next();
//            scores(name);
//        }
//    }
//
//    static void isTrip(int numPrason) {
//        int prson = 0;
//        while (prson < numPrason) {
//            System.out.println("Enter LastName");
//            String famliy = scan.next();
//            System.out.println("How many people");
//            int many = scan.nextInt();
//            if (many < (numPrason - prson)) {
//                prson += many;
//                System.out.println("family " + famliy + " Must pay " + (many * 100));
//            } else
//                System.out.println("I'm sorry " + famliy + " NO");
//        }
//    }
//
//    static int arrayDoRow(int[][] arr, int k) {
//        int row = 1;
//        for (int i = 0; i < arr[k].length; i++) {
//            if (arr[k][i] <= 0) {
//                row = 0;
//                break;
//            }
//        }
//        System.out.println(row);
//        return row;
//    }
//
//    static int arrayDoindex(int[][] arr, int j) {
//        int index = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i][j] <= 0) {
//                index = 0;
//                break;
//            }
//        }
//        System.out.println(index);
//        return index;
//    }
//
//    static void bigArray(int[][] arr) {
//        int row = 0;
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            row += arrayDoRow(arr, i);
//            for (int j = 0; j < arr[0].length; j++) {
//                index += arrayDoindex(arr, i);
//
//                System.out.print(row + " this row");
//                System.out.print(index + " this index ");
//            }
//            if (row > index) {
//                System.out.println("yes");
//            } else {
//                System.out.println("no");
//            }
//        }
//    }
//
//    static double bookCase(double book1, double book2) {
//        double paybook = 0;
//        if (book1 < book2)
//            paybook = book1 / 2 + book2;
//        else
//            paybook = book2 / 2 + book1;
//        System.out.println(paybook);
//        return paybook;
//    }
//
//    static double bookCase(double book1, double book2, double book3) {
//        double cheap = 0;
//        cheap = Math.min(book1, Math.min(book2, book3));
//        return book1 + book2 + book3 - cheap;
//    }
//
//    static double saleBook(int num) {
//        if (num == 2) {
//
//            System.out.println("enter price of 1 book ");
//            double book1 = scan.nextDouble();
//            System.out.println("enter price of 2 book ");
//            double book2 = scan.nextDouble();
//            bookCase(book1, book2);
//        }
//        if (num == 3) {
//
//            System.out.println("enter price of 1 book ");
//            double book1 = scan.nextDouble();
//            System.out.println("enter price of 2 book ");
//            double book2 = scan.nextDouble();
//            System.out.println("enter price of 3 book ");
//            double book3 = scan.nextDouble();
//            System.out.println(
//                    bookCase(book1, book2, book3));
//        }
//        return 0;
//    }
//
//    static void storeBook() {
//        System.out.println("enter name: ");
//        String name = scan.next();
//        System.out.println(" how many books? : ");
//        int num = scan.nextInt();
//
//        saleBook(num);
//
//        System.out.println(name);
//
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//
//        int[] array = {33, 545, 6, 7, 7, 78, 19, 8, 5,};
////        System.out.println(add(3, 6, '*'));
////        Integers(array);
////        vacation();
////        student(3);
////        isTrip(100);
//        int[][] arr1 = {{1, -2, 15, 4, 0}, {12, 3, 28, 6, 7}, {0, 5, -7, 12, 3}, {1, -2, 15, 4, 0}, {12, 3, 28, 6, 7}, {0, 5, -7, 12, 3}};
////        arrayDoindex(arr1, 4);
////        arrayDoRow(arr1, 2);
//        storeBook();
////        bigArray(arr1);
//    }
//}
//----------------------17/11/19------------

//    static int number(int num1, int num2, int num3) {
//        if ((num1 + num2 + num3) % 2 == 0)
//            return 'y';
//        else
//            return 'n';
//    }
//
//    static void array(int[] x) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println(" Enter number K");
//        int k = scan.nextInt();
//        for (int i = 0; i < x.length; i++) {
//            x[i] += k;
//        }
//
//    }
//
//    static boolean ChargeForShipping(int num) {
//        int sum = 0;
//        for (int i = 0; i < num; i++) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Charge For Shipping");
//            sum += scan.nextInt();
//        }
//        if (sum < 150) {
//            return true;
//        }
//        return false;
//    }
//
//    static boolean sumArray(int[][] array, int k, int x, int num) {
//        int sum = 0;
//        for (int i = k; i < k + 2; i++) {
//            for (int j = x; j < x + 2; j++) {
//                sum += array[i][j];
//            }
//            if (sum > num)
//                return true;
//        }
//        return false;
//    }
//    static void CalculateDiscount(int allfamily) {
//        int family = 0;
//        int student = 0;
//        int Highschoolstudent = 0;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Number Persons");
//        int NumberPersons = scan.nextInt();
//        if (NumberPersons > 6)
//            family = 100;
//        System.out.println("Enter Highschool student");
//        Highschoolstudent = scan.nextInt();
//        for (int i = 0; i < Highschoolstudent; i++)
//            student += 40;
//        if (family < student) {
//            family = student;
//        }
//        System.out.println(" The discount amount is " + family);
//    }
//
//

//
//
//        int allfamily = 0;
//        int cuntor = 0;
//        System.out.println("Several families in the locality");
//        allfamily=scan.nextInt();
//        CalculateDiscount(allfamily);
//        cuntor += allfamily;


//        for (int i = 0; i < 850; i++) {
//            System.out.println("Some Products");
//            int Products = scan.nextInt();
//            if (ChargeForShipping(Products)) {
//
//                System.out.println("this true Shipping " + i + "");
//            }
//            ;
//        }
//        System.out.println("100 parking spaces");
//        int car = 0;
//        int parking = 50;
//        int high = 5;
//        int ton = 10;
//        while (parking > car) {
//            System.out.println("enter high of car: ");
//            high = scan.nextInt();
//            if (high < 5) {
//                System.out.println("enter ton of car: ");
//                ton = scan.nextInt();
//                if (ton < 10)
//                    car++;
//                System.out.println(" Several free parking spaces " + car);
//            } else
//                System.out.println("this car not Enter " + car);
//
//        }


//        ------------------------------------------13.11.2019------------------


//        System.out.println(ChargeForShipping(5));
//        exercise 1
//            MultiplicationTable(10);
////        exercise 2
//        int[] one = {1, 2, 5, 4, 6};
//        int[] two = {8, 7, 3, 9, 10};
//        arrayInArray(one, two);
////        exercise 3
//        arrayReturnsDiagonally(5);
////        exercise 4
//        NumberX2FromItsPredecessor(7);
////        exercise 7
//        int[][] arr = {{4, 5, 6, 8, 3, 2,}, {9, 5, 6, 8, 2, 5}, {7, 8, 5, 2, 1, 3}, {9, 5, 6, 8, 2, 5}, {7, 4, 2, 3, 3, 5}};
//        ArrayIndexMethod(arr);
////        exercise 8
//        arraybubblesSort(arr);
////        exercise 9
//        System.out.println(ReturnsAnAverage(one));
////        exercise 10
//        System.out.println(LowNumber(96, 90, 8));
//        System.out.println(BigNumber(96, 97, 5));
////        exercise 11
//        IndexTheSmall(two);
////        exercise 1
////        System.out.println("Enter number of array : ");
////        int n = scan.nextInt();
//    }

//    static int[][] MultiplicationTable(int n) {
//        int[][] array = new int[n][n];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                System.out.print(String.format("%4d", array[i][j] = (i + 1) * (j + 1)));
//            }
//            System.out.println();
//        }
//        return array;
//    }
//
//
//    //        exercise 2
//    static int[] arrayInArray(int[] one, int[] two) {
//        int odd = 1;
//        int[] sum = new int[one.length];
//        for (int i = 0; i < one.length; i++) {
//            sum[i] = one[i] + two[i];
//            System.out.print(sum[i] + " ");
//        }
//        for (int i = 0; i < one.length; i++) {
//            if (sum[i] % 2 == 0) {
//                System.out.print(odd);
//            } else
//                System.out.print(odd - 1);
//        }
//        return sum;
//    }
//
//
////        exercise 3
//
//    //        System.out.println("Enter number array : ");
////        int n = scan.nextInt();
//    static void arrayReturnsDiagonally(int n) {
//        int[] slant = new int[n];
//        int[][] array = new int[n][n];
//        int num = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(String.format("%4d", array[i][j] = num));
//                num++;
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(String.format("%4d", slant[i] = array[i][i]));
//        }
//        System.out.println();
//
//        for (int i = n - 1, j = 0; i >= 0 && j < array.length; i--, j++) {
//            System.out.print(String.format("%4d", slant[i] = array[j][i]));
//        }
//
//    }
//
//
//    //        exercise 4
//    static void NumberX2FromItsPredecessor(int n) {
////        System.out.println("Enter number array : ");
////        int n = scan.nextInt();
//        int sum = 1;
//        int[][] array = new int[n][n];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(String.format("%8d", array[i][j] = sum));
//                sum += sum;
//            }
//            System.out.println();
//        }
//    }
//
//    //    exercise 7
//    static void ArrayIndexMethod(int[][] arr) {
//        for (int i = 0; i < arr[0].length; i++) {
//            System.out.print(String.format("  " + i));
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + " ");
////            System.out.print("Index Row -"+i+"-");
//            for (int j = 0; j < arr[0].length; j++)
//                System.out.print(arr[i][j] + "  ");
//
//            System.out.println();
//        }
//    }
//
//    static void ArrayIndexMethod(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(String.format("%4d", arr[i]));
//            System.out.println();
//        }
//    }
//
//
//    //    exercise 8
//
//    static int[][] arraybubblesSort(int[][] array) {
//        System.out.println("Array bubbles Sort");
//        int[] slant = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(String.format("%4d", slant[i] = array[i][i]));
//            slant[i] = array[i][i];
//        }
//        System.out.println();
//        int temp = 0;
//        for (int i = 0; i < slant.length; i++) {
//            for (int j = 0; j < slant.length - 1 - i; j++) {
//                if (slant[j] > slant[j + 1]) {
//                    temp = slant[j];
//                    slant[j] = slant[j + 1];
//                    slant[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("The line is bubble sort");
//        for (int i = 0; i < slant.length; i++) {
//
//            System.out.print(slant[i] + " ");
//            array[i][i] = slant[i];
//        }
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                System.out.print(String.format("%4d", array[i][j]));
//            }
//            System.out.println();
//        }
//        return array;
//    }
//
//    //    exercise 9
//    static double ReturnsAnAverage(int[] arr) {
//        System.out.println("Returns An Average");
//        int sum = 0;
//        int cuntor = 0;
//        double average = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            cuntor++;
//        }
//        System.out.println(sum);
//        System.out.println(cuntor);
//        average = sum / cuntor;
//        return average;
//    }
//
//    //    exercise 10
//    static int LowNumber(int num1, int num2, int num3) {
//        System.out.println(" Low Number");
//        if (num1 < num2 && num1 < num3) {
//            return num1;
//        }
//        if (num2 < num1 && num2 < num3) {
//            return num2;
//        } else return num3;
//    }
//
//    static int BigNumber(int num1, int num2, int num3) {
//        System.out.println("Big Number");
//        if (num1 > num2 && num1 > num3) {
//            return num1;
//        }
//        if (num2 > num1 && num2 > num3) {
//            return num2;
//        } else return num3;
//    }
//
//    //    exercise 11
//    static void IndexTheSmall(int[] array) {
//        System.out.println("The Small");
//        int temp = 0;
//        for (int i = 1; true; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i == array[j])
//                    System.out.println(i);
//
//            }
//            break;
//        }
//    }
//}
//
////        ____________________________________________________________________
////    static int atzret(int num) {
////        int atzret = 1;
////        for (int i = 1; i <= num; i++)
////            atzret *= i;
////    }
////    return atzret;
////}
////     public
//
//
//////_______07/11/2019
//
////        System.out.println("enter  Array number : ");
////        int size = scan.nextInt();
////        int[] number = new int[size];
////        for (int i = 0; i < size; i++) {
////            System.out.println(String.format("enter The %d Location:", i));
////            number[i] = scan.nextInt();
////        }
////        for (int i = size -1 ; i >= 0; i--) {
////            System.out.print(number[i] + " ");
////
////        }
////    }
////}
////        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
////        String[] mall = {"apple", "banana", "kiwi", "orange", "fruit", "meat", "milk"};
////        System.out.println("enter  number for day : ");
////        int day = scan.nextInt();
////        while
////        (day > 7 || day < 1) {
////            System.out.println("enter  number for day agen : ");
////            day = scan.nextInt();
////        }
////        System.out.print(" the Meal for " + days[day-1] + " this " + mall[day-1]);
////    }
////}
////        System.out.println("enter  Array number : ");
////        int size = scan.nextInt();
////        int[] number = new int[size];
////        for (int i = 0; i < size; i++) {
////            System.out.println(String.format("enter The %d Location:", i));
////            int staer = scan.nextInt();
////       for (int j = 0; j < staer; j++) {
////
////                System.out.print(number[i] + " * ");
////            }
////        }
////
////    }}
////        System.out.println("enter  Array number : ");
////        int size = scan.nextInt();
////        String[] names =new String[size];
////        int[] arr = new int[size];
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println("enter name: ");
////            names[i] = scan.next();
////            System.out.println("enter phone number: ");
////            arr[i] = scan.nextInt();
////        }
////        for (int i = 0; i < arr.length; i++)
////        System.out.print(" name "+ names[i] + " phone number " +arr[i] + " ");
////    }
////}
////public class BubbleSortExample {
////    static void bubbleSort(int[] arr)
////        int[] arr = {100, 3, 4, 0, 0, 10, -1,
////                99};
////        int n = arr.length;
////        int temp = 0;
////        for (int j = 1; j < n; j++) {
////            for (int i = 0; i < n - 1-j ; i++)
////                if (arr[i] > arr[i+1]) {
////                    temp = arr[i];
////                    arr[i] = arr[i+1];
////                    arr[i+1] = temp;
////                }
////            for (int i = 0; i < n; i++) {
////                System.out.print(arr[i] + " ,");
////            }
////            System.out.println();
////        }
////
////    }}
////-----------------------------------------------------------------
////-----------------homework 07/11/2019
////        exercise 1
////        System.out.println("enter  Array number  : ");
////        int size = scan.nextInt();
////        int[] arr = new int[size];
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println("enter array: ");
////            arr[i] = scan.nextInt();
////        }
////        for (int j = 0; j <= arr.length -1; j--)
////        System.out.println( arr[j]);
////    }
////}
//// exercise 2
////        int[] arr = {10, 14, 10, 200, 10, 44, 19, 1};
////        int n = arr.length;
////        int[] arr2 = new int[n];
////        for (int i = 0; i < n; i++) {
////            System.out.print(arr[i] + " ,");
////        }
////        int temp = 0;
////        for (int j = 0; j < n; j++) {
////            for (int i = 0; i < n - 1 - j; i++)
////                if (arr[i] > arr[i + 1]) {
////                    temp = arr[i];
////                    arr[i] = arr[i + 1];
////                    arr[i + 1] = temp;
////                }
////
////            }
////        System.out.println();
////        arr2 = arr;
////        for (int i = 0; i < n; i++) {
////            System.out.print(arr2[i] + " ,");
////        }
////    }
////}
////exercise 3
////        int[] arr = {10, 14, 10, 200, 10, 44, 19, 1};
////        System.out.println("enter number scaner : ");
////        int num = scan.nextInt();
////        int idx = -1;
////        for (int i = 0; i < arr.length; i++) {
////            if (num == arr[i]) {
////                idx = i;
////            }
////        }
////        System.out.println("the number index " + idx);
////    }
////}
////exercise 4
////        int num;
////        String[] names = new String[10];
////        for (int i = 0; i < names.length; i++) {
////            System.out.println(" Enter names " + (i + 1) + " for Username : ");
////            names[i] = scan.next();
////        }
////        while (true) {
////            System.out.println(" Enter number Username: ");
////            num = scan.nextInt();
////            System.out.println(names[num] + ",");
////        }
////    }
////}
////exercise 5
////        int sum = 0;
////        int[] arr = new int[50];
////        for (int i = 1; i <= 100; i++) {
////            if (i % 2 == 0) {
////                arr[sum] = i;
////                sum++;
////            }
////        }
////        sum = 0;
////        for (int i = 0; i < 10; i++) {
////            for (int j = 0; j < 5; j++) {
////                if (sum > arr.length) {
////                    break;
////                }
////                System.out.print(arr[sum] + "    ");
////                sum++;
////            }
////            System.out.println();
////        }
////    }
////}
////        exercise 6
//
////        long[] arr = new long[30];
////        arr[0] = 1;
////        for (int i = 0; i < arr.length - 1; i++) {
////            arr[i + 1] = arr[i] * 3;
////        }
////        for (int i = 0; i < arr.length; i++)
////            System.out.println(arr[i]);
////    }
////}
////exercise 7
////        System.out.println("enter  N number : ");
////        int size = scan.nextInt();
////        String[] number = new String[size];
////        for (int i = 0; i < number.length; i++) {
////            System.out.println("enter number 1,2,3,4,: ");
////            int num = scan.nextInt();
////            for (int j = 0; j < num; j++) {
////                number[i] += "@";
////            }
////        }
////        for (int i =0 ; i < number.length;i++)
////        System.out.print(number[i] + ",");
////    }
////}
//
//
////        -------------------------------------//10.11.19-----------------
////        exercise 1
////        System.out.println("enter  N number : ");
////        int n = scan.nextInt();
////        String[][] array = new String[n][n];
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array.length; j++)
////                array[i][j] = "*";
////        }
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array.length; j++) {
////                System.out.print(array[i][j]);
////            }
////            System.out.println();
////        }
////    }
////}
////        exercise 2
////        System.out.println("enter  N number : ");
////        int n = scan.nextInt();
////        int num = 1 ;
////        int[][] array = new int[n][n];
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array.length; j++)
////                array[i][j] = num++  ;
////        }
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array.length; j++) {
////                System.out.print(array[i][j] + " ,");
////            }
////            System.out.println();
////        }
////    }
////}
////        exercise 3
////        System.out.println("enter  N number : ");
////        int n = scan.nextInt();
////
////        String[][] array = new String[n][n];
////        for (int i = 0; i <array.length; i++) {
////            for (int j = 0; j < array.length ; j++)
////                array[i][j] = "  ";
////        }
////        for (int i = 0; i <=array.length ; i++ ){
////            for (int j = 0; j <= array.length-1-i ; j++)
////                array[j][i] = " * ";
////        }
////        for(int i =0 ;i<array.length;i++){
////            for (int j = 0; j < array.length; j++) {
////            System.out.print(array[i][j]);
////            }  System.out.println();
////
////}
////}}
//// exercise 4
////
////        int[][] slant = new int[4][5];
////        int[][] number = new int[4][5];
////
////        for (int i = 0; i < number.length; i++) {
////            for (int j = 0; j < number[0].length; j++) {
////                if (i == 0) {
////                    number[i][j] = (j + 1);
////                    System.out.print(number[i][j] + " ");
////                }
////                if (i == 1) {
////                    number[i][j] = (j + i) * (i + i);
////                    System.out.print(number[i][j] + " ");
////                }
////                if (i == 2) {
////                    number[i][j] = j * (i + j);
////                    System.out.print(number[i][j] + " ");
////                }
////                if (i == 3) {
////                    number[i][j] = i * (j + 1);
////                    System.out.print(number[i][j] + " ");
////                }
////
////            }
////            System.out.println();
////        }
////        System.out.println();
////        for (int i = 0; i < number.length; i++) {
////            for (int j = 0; j <number[0].length; j++) {
////                slant[i][j] = number[i][j];
////            }
////        }
////        for (int i = 0; i < slant.length; i++) {
////            for (int j = 0; j < slant[0].length; j++) {
////                slant[i][i] = (i+1) * (i+1);
////                slant[i][i + 1] = (i+1) * slant[0].length;
////                System.out.print(slant[i][j] + " ");
////            }
////
////            System.out.println();
////    }
//
////    }
////}
//
//
////        ____________________________________________________________________________________________________
//// exercise
////public class test {
////    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        System.out.println("enter  number : ");
////        int num = scan.nextInt();
////        int sum = 0;
////        for (int i = 0; true; i++) {
////            if (i % 2 == 1 && i % 13 == 1) {
////                System.out.println(i);
////                sum += 1;
////
////                System.out.println(sum);
////                if (sum == 5)
////                    break;
////            }
//
////        }
////
////    }
////}________________________________________________________________________________________________________________
///// exercise 1
////       exercise
////        while (password != 1234){
////
////System.out.println(" Wrong password Please try again : ");
////
////        password = scan.nextInt();
////    }
////        System.out.println("excellent");
////    }
////}
////exercise 2
////        int sum = 0;
////        int count = 0;
////        while (true) {
////            System.out.println("enter number");
////            int num = scan.nextInt();
////            sum += num;
////            count++;
////            if (num == )
////                break;
////        }
////    }
////}
////        exercise 3
////        System.out.println("enter  number : ");
////        int num = scan.nextInt();
////        int i = 0;
////        while (1<num){
////            i++;
////            num--;
////            System.out.println(i);
////        }}}
////        exercise 4
////        System.out.println(" numbers : ");
////        int i =0;
////while ( i<10){
////    i++;
////    if (i == 7){
////        continue;
////    }
////    System.out.println(i);
////           }
////}}
//// exercise 5
////   System.out.println(" numbers : ");
////           int i =0;
////           int sum =0;
////           while ( i<100){
////        i++;
////        if (i % 3==0 && i % 7==0){
////        sum = i ;
////            System.out.print(sum + ",");
////        }
////
////        }
////        }}
////        exercise 6
////        int sum = 1;
////        int i = 1;
////                while (i < 30) {
////            i++;
////            sum = sum*2 ;
////                       System.out.print(sum+" ,");
////        }
////    }
////}
////exercise 7
////        System.out.println("enter a number : ");
////        int x = scan.nextInt();
////        System.out.println("number two");
////        int y = scan.nextInt();
////        int som = 0;
////        som = x * y;
////        System.out.println(som);
////    }}
////exercise 8
////        System.out.println("enter a number : ");
////        int x = scan.nextInt();
////        System.out.println("number two");
////        int y = scan.nextInt();
////        while (x < y) {
////            x++;
////            System.out.println(x);
////        }
////        while (y < x) {
////            y++;
////            System.out.println(y);
////        }
////    }
////}
////         exercise 9
////        System.out.println("enter a number : ");
////        int x = scan.nextInt();
////        int board = 0;
////        for (int i = 1; i <= x; i++) {
////            for (int j = 2; j <= x; j++) {
////                if (i % j == 0) {
////                    board = i;
////                    System.out.print(board + " ,");
////                }
////                System.out.println();
////            }
////
////        }
////    }
////}
//
////        ---------------------------------------------------------------------------------------
////           for ( int i = 0 ; i < 80 ; i++){
////               System.out.println("enter  number : ");
////               int num1 = scan.nextInt();
////               System.out.println("number two");
////               int num2 = scan.nextInt();
////               System.out.println("numer there");
////               int num3 = scan.nextInt();
////               i =( num1+ num2+num3) / 3;
////               System.out.println("  הממוצע של 3 מספרים "+i);
////           }
////
////           }
////    }
//
////        exercise
//
//
////    while (true){
////        int counter =0;
////        int inreng= 0;
////        int outside= 0 ;
////
////        for (int i = 1; i<=10;i++){
////            System.out.println("enter " + i + " number");
////            int number = scan.nextInt();
////            counter ++;
////             if (number< 100) {
////                 inreng += number;
////                 System.out.println("in reng " + inreng);
////             }else {
////                 outside += number;
////            System.out.println("outside " + outside);
////
////
////
////             }}
////        if(counter == 10)
////            break;
////System.out.println(inreng/counter  + inreng +" זה הממוצע של 10 המספרים שבתוך ");
////        }
////    }}
//
////  exercise 1
////public class test {
////    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////         int num = 0;
////        while (num < 43){
////            System.out.print(" * ");
////            num++;
////        }}}
//
////  exercise 2
////public class test {
////    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        System.out.println("enter  number : ");
////        int num = scan.nextInt();
////
////        int sum = 0;
////        while  ( num> 0){
////
////                while (num % 3 == 0) {
////                    sum = num;
////                    System.out.println(sum);
////                    break;
////                }
////                num--;
//
////    }}}
////}
////  exercise 3
////        System.out.println("enter  number : ");
////        int num = scan.nextInt();
////        int sum ,some;
////        while (ture){
////            sum = num % 3 == 0 && num % 5 == 0;
////         some = num % 3== 0 || num % 5 == 0 ;
////
////
////        }}}
//
////  exercise 4
////     System.out.println(("The sum of the couple numbers"));
////        int count = 0;
////        int sum =0;
////        while (count <= 100) {
////            System.out.println(sum);
////           count = count + 2;
////            sum += count;
////        }
////    }
////}
////
//
////exercise 5
////        System.out.println(("Multiplication odd"));
////        int count = 1;
////        int multiplication =0;
////        while (count <= 100) {
////            System.out.println(multiplication);
////            count = count + 2;
////            multiplication += count * count;
////
////        }
////    }
////}
////exercise 6
////        System.out.println("enter  number : ");
////        int num = scan.nextInt();
////        int factori = 1;
////        int countr = 1;
////        while (countr <= num) {
////           int sum = countr * factori;
////            factori = sum;
////            countr++;
////        }
////        System.out.println(factori);
////    }
////}
////exercise 7
////        System.out.println("enter  number : ");
////        int num = scan.nextInt();
////        int numbers;
////        int separator = 10000;
////        int i = 0;
////        int coutr = 0;
////        while (coutr < separator) {
////            numbers = num / separator;
////            i = numbers % 10;
////            separator = separator / 10;
////            System.out.print(i + ", ");
////        }
////    }
////}
//
////this method skips unnecessary trial divisions and makes
////trial division more feasible for finding large primes
//
//
////  exercise 8
////        System.out.println("enter  number : ");
////        int num = scan.nextInt();
////        int numbers;
////        int i = 0;
////        int coutr = 0;
////        while (coutr < 5) {
////
////            numbers = num;
////            i = numbers % 10;
////            num = numbers / 10;
////            coutr++;
////
////
////
////            System.out.print(i);
////
////        }
////    }
////}
//
//
////        int numA = scan.nextInt();
////        System.out.println("number two");
////        int numB = scan.nextInt();
////        System.out.println("number threr");
////        int numC = scan.nextInt();
////
////        if (numB < numA && numB > numC) {
////            System.out.println("A series goes down");
////        } else if (numB > numA && numB < numC) {
////            System.out.println("is up");
////        }
////        else
////            System.out.println("The numbers are not arranged");
////    }}
//
//
////        double circle = scan.nextInt();
////        double sumCircle =  3.14 * ((circle / 2)* (circle / 2)) ;
////        if (sumCircle >10) {
////            System.out.println("Circle is big from 10smr " + sumCircle);
////        } else
////        System.out.println(sumCircle);
////    }
////}
//
////        double tip = sum *= 0.1;
////        if (sum <= 100) {
////           System.out.println( sum *= 0.09) ;
////        }else if (sum < 100 && sum >= 200){
////            System.out.println(sum * 0.08);
////
////        }
////        System.out.println("The amount of Tip that should be left is shkel " + tip );
//
////    }}
//
//
////        int number = scan.nextInt();
////             if (number % 2 == 0 && number % 5 == 0){
////                System.out.println(number / 10);
////        }   if (number %2 == 0 ){
////                System.out.println((number / 2));
////            } else if (number % 5 == 0) {
////            System.out.println(number / 5);
////        }
////            }}
////        switch (score) {
////            case 100:
////                System.out.println("this is Amazin " + score);
////                break;
////            case 99:
////            case 98:
////            case 97:
////            case 96:
////            case 95:
////            case 94:
////                System.out.println("this is A+++ " + score);
////                break;
////            case 93:
////            case 92:
////            case 91:
////            case 90:
////            case 89:
////            case 88:
////                System.out.println("this is Vary Good " + score);
////                break;
////            case 87:
////            case 86:
////            case 85:
////            case 84:
////            case 82:
////            case 81:
////            case 80:
////                 System.out.println("this is Good " + score);
////                break;
////            case 79:
////            case 78:
////            case 77:
////            case 76:
////            case 75:
////            case 74:
////            case 73:
////            case 72:
////            case 71:
////            case 70:
////            case 69:
////            case 68:
////            case 67:
////            case 66:
////                System.out.println("this is not Good " + score);
////                break;
////                default:
////                    System.out.println("Not in range " + score);
////                    break;
////        }
////    }}
//
////        System.out.println(" Please Enter  number  zogi / not zogi: ");
////        int numbre = scan.nextInt();
////        if (numbre % 2 == 0) {
////            System.out.println(numbre + " this number zogi " );
////        } else System.out.println(numbre + " this number not zogi ");
////    }
////    }
////
////        Scanner scan = new Scanner(System.in);
////
////        System.out.println(" Please Enter Three numbers: ");
////
////        int numbre1 = scan.nextInt();
////
////        System.out.println("enter number");
////
////        int numbre2 = scan.nextInt();
////
////        System.out.println("enter number");
////
////        int numbre3 = scan.nextInt();
////
////        if (numbre1 > numbre2 && numbre1 > numbre3) {
////            System.out.println("thie is the big " + numbre1);
////        } else if (numbre1 > numbre2 || numbre1 > numbre3) {
////            System.out.println("this is meduim " + numbre1);
////        } else if (numbre1 < numbre2 && numbre1 < numbre3) {
////            System.out.println("this is smail " + numbre1);
////        }
////
////        if (numbre2 > numbre1 && numbre2 > numbre3) {
////            System.out.println("thie is the big " + numbre2);
////         } else if (numbre2 > numbre3 || numbre2 > numbre1) {
////            System.out.println("this is meduim " + numbre2);
////         } else if (numbre2 < numbre3 && numbre2 < numbre1) {
////            System.out.println("this is smail " + numbre2);
////        }
////
////        if (numbre3 > numbre2 && numbre3 > numbre1) {
////            System.out.println("thie is the big " + numbre3);
////        } else if (numbre3 > numbre2 || numbre3 > numbre1) {
////            System.out.println("this is meduim " + numbre3);
////        } else if (numbre3 < numbre2 && numbre3 < numbre1) {
////            System.out.println("this is smail " + numbre3);
////        }}}
//
//
////        int num1 =  numbers % 10 ;
////        int num3 = numbers / 100;
////        int middle = numbers / 10;
////        int num2 =  middle % 10 ;
////         int sum = num1 + num2 + num3;
////
////         System.out.println(sum);
//
//
////       System.out.println("Enter Your street name : ");
////       String street = scan.next();
////        System.out.println("Enter your telpon number: ");
////        int number = scan.nextInt();
////
////        System.out.println("Name: " + name + ", Street: " + street + " telpon" + number
////                 );
////
//
////\\         1
//
////        System.out.println("Get three numbers and display their product: ");
////
////       int numbre1 = scan.nextInt();
////
////        System.out.println("enter number");
////
////        int numbre2 = scan.nextInt();
////
////        System.out.println("enter number");
////
////        int numbre3 = scan.nextInt();
////
////        int sum = ( numbre1 * numbre2 * numbre3 )  ;
////
////        System.out.println(sum);
//
////
////        if (numbre >= 100 || numbre <= 0 ){
////           System.out.println("the number is  Not in range");
////           }else if (numbre % 2 == 0) {
////           System.out.println("Is number even");
////       } else {
////           System.out.println(("Is number "));
////           }
////       if ( numbre == 100 || numbre == 0){
////           System.out.println("נא הכניס מספר בין 100 ל 0");
////       }





