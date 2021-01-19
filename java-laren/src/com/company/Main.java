package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main  {



    public static void main(String[] args) {
        ClassA tim1 = new ClassA("chaim",2,2,4);

       String mane ="chaim baror";

        for (int i = 0; i <mane.length() ; i++) {
            if (i>3)
            System.out.println(mane + " "+ i);
        }
        mane ="moshe";

        System.out.println(tim1.toString());
        tim1.Play();
        System.out.println(tim1.toString());
	// write your code here
        System.out.println(solveSuperMarketQueue( new int[]{6,7,5,2,5,2,4,4,4,1,2,5,5,1},7));

    }


        public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == -1) {
                return 0;
            }

            for (int i = 0; i <customers.length ; i=+n) {
                System.out.println();
            }

//             Arrays.sort(customers);
                int som =0;
                    for (int s :customers){
                        som +=s;
                    }

                 if(customers[customers.length-1]>som/n)  {

                     return customers[customers.length-1];
                 }
                return (int) som/n;
            }

    class Solution {
        public int solution(int[] juice, int[] capacity) {
            // write your code in Java SE 8
            int cap=0;
            int some=0;
            int max=0;
            for(int c:capacity){
                max=c<check(c ,juice[i]))
                if (max > some){
                    some = max;
                }
            }
        }

     return some;
    }


    public int check(int capacity, int[] juice) {
        int amount=0;
        int tmpMax=0;
        int lastMax =-1;

        for(int ju : juice){
            if (ju + amount <= capacity){ // can add flavours to glass
                amount += ju; // Update the current amount in the glass
                tmpMax ++ // Update num of flavours
                //console.log("cap", capacity, "ju", ju , "max" ,max , "lMx" , lastMax , "am", amount)
                lastMax = tmpMax > lastMax && amount == capacity ? tmpMax : lastMax
            }else {// Start a new count
                amount = ju // Reset amount
                // Reset tem max
                tmpMax = amount <= capacity ? 1 : 0
            }
        }
        // return tmpMax when all glass are not full
        return lastMax > -1 ? lastMax : tmpMax;
    }
}





class Solution {
    public int solution(int[] juice, int[] capacity) {
        int cap=0;
        System.out.println();
        ArrayList<Integer> some= new ArrayList<Integer>();

        for ( int c :capacity){
            for (int i = 0; i <juice.length ; i++) {
                for (int j = i+1; j <juice.length ; j++) {
                    some.add(juice[i]+juice[j]);
                }
                for (int j = i+1; j <juice.length ; j=+2) {
                    some.add(juice[i]+juice[j]);
                }
                for (int j = i+1; j <juice.length ; j=+3) {
                    some.add(juice[i]+juice[j]);
                }

                if(some.contains(c)){
                    cap++;
                    continue;
                    break;
                }

            }
        }


return cap;

        // write your code in Java SE 8
    }


}
//    Pennies (1¢), Nickels (5¢), Dimes (10¢) and Quarters (25¢)

public class Change {
    public static HashMap<String, Integer> looseChange(int cent) {
        int some=cent;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        if(some>=25){
          int Quarters=(int) some/25;
            map.put("Quarters", Quarters);
            some=some-Quarters*25;
        }
        if(some>=10){
            int Dimes=(int) some/10;
            map.put("Dimes", Dimes);
            some=some-Dimes*10;
        }
        if(some>=5){
            int Nickels=(int) some/5;
            map.put("Nickels", Nickels);
            some=some-Nickels*5;
        }
        if(some>=1){
            int Pennies=(int) some/1;
            map.put("Pennies", Pennies);
            some=some-Pennies*1;
        }



        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);
        //your code here
        return map;
    }

    public class Conversion {

        public String solution(int n) {
            HashMap<Integer,String> map = new HashMap<Integer,String>();
            map.put(1 ,"I");
            map.put(5, "v");
            map.put(10,"X");
            map.put(50,"L");
            map.put(100,"C");
            map.put(500 ,"D");
            map.put(1000,"M");
            if ((number < 0) || (number > 3999)) throw new ArgumentOutOfRangeException("insert value betwheen 1 and 3999");
            if (number < 1) return string.Empty;
            if (number >= 1000) return "M" + ToRoman(number - 1000);
            if (number >= 900) return "CM" + ToRoman(number - 900);
            if (number >= 500) return "D" + ToRoman(number - 500);
            if (number >= 400) return "CD" + ToRoman(number - 400);
            if (number >= 100) return "C" + ToRoman(number - 100);
            if (number >= 90) return "XC" + ToRoman(number - 90);
            if (number >= 50) return "L" + ToRoman(number - 50);
            if (number >= 40) return "XL" + ToRoman(number - 40);
            if (number >= 10) return "X" + ToRoman(number - 10);
            if (number >= 9) return "IX" + ToRoman(number - 9);
            if (number >= 5) return "V" + ToRoman(number - 5);
            if (number >= 4) return "IV" + ToRoman(number - 4);
            if (number >= 1) return "I" + ToRoman(number - 1);





            }

            return var ;
        }
    }
}
static {
        ROMAN_NUMBERS_MAP.put(1000, "M");
        ROMAN_NUMBERS_MAP.put(900, "CM");
        ROMAN_NUMBERS_MAP.put(500, "D");
        ROMAN_NUMBERS_MAP.put(400, "CD");
        ROMAN_NUMBERS_MAP.put(100, "C");
        ROMAN_NUMBERS_MAP.put(90, "XC");
        ROMAN_NUMBERS_MAP.put(50, "L");
        ROMAN_NUMBERS_MAP.put(40, "XL");
        ROMAN_NUMBERS_MAP.put(10, "X");
        ROMAN_NUMBERS_MAP.put(9, "IX");
        ROMAN_NUMBERS_MAP.put(5, "V");
        ROMAN_NUMBERS_MAP.put(4, "IV");
        ROMAN_NUMBERS_MAP.put(1, "I");
        }

public static String solution(int number) {
        Integer key = ROMAN_NUMBERS_MAP.floorKey(number);
        if (key == null)
        return "No roman equivalent";

        if (number == key.intValue()) // Fits perfectly
        return ROMAN_NUMBERS_MAP.get(number);

        return ROMAN_NUMBERS_MAP.get(key) + solution(number - key); // Add rest recursively
        }
        }