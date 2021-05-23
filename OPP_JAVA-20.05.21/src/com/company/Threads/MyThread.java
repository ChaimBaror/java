package com.company.Threads;


import static java.lang.Thread.sleep;

public class MyThread extends Thread {
    private int couner;

    public void run() {

        for (int i = 0; i <10; i++) {
            couner =i;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("my thread is work : "+  getName() +"  : " + couner);

        }
        System.out.println("finsh thread  name : " +  getName());

    }



}
