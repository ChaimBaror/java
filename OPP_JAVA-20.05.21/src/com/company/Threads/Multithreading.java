package com.company.Threads;

public class Multithreading implements Runnable  {
    private boolean condition = true;

    @Override
    public void run() {
        while (condition){

            for (int i = 0; i <10 ; i++) {
                Thread t = new MyThread();
                t.setName("wokered - " + i);
                t.start();
                System.out.println(t.getName());

            }
            condition = false;

        }

    }

}
