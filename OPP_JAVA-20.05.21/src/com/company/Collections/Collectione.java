package com.company.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collectione {

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    public Collectione() {
        for (int i = 10; i <= 50; i += 10) {
            numbers.add(i);
        }
        System.out.println(numbers);
        Collections. shuffle(numbers);
        System.out.println("The numbers after shuffle: " + numbers);
        Collections. sort(numbers);
        System.out.println("The numbers after sort: " + numbers);
        Collections. reverse(numbers);
        System.out.println("The numbers after reverse: " + numbers);
        Collections. rotate(numbers,2);
        System.out.println("The numbers after rotate twice: " + numbers);
        Collections. replaceAll(numbers, 50,8);
        System.out.println("The numbers after replace 50 in 8: " + numbers);
        System.out.println("The max number is: " + Collections. max(numbers));
    }
}
