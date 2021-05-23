package com.company;

import com.company.Collections.Collectione;
import com.company.Genral.ContactInfo;
import com.company.Genral.Genral;
import com.company.Genral.Students;
import com.company.MapLernnig.HashMapClass;
import com.company.MapLernnig.SetArray;
import com.company.Threads.Multithreading;

public class Main{

    public static void main(String[] args) {
        Thread t  =new Thread( new Multithreading(),"muiThread") ;
        t.start();

        new Collectione();
        new HashMapClass();

        Genral genralMain= new Genral();
        genralMain.toPrint();

        Students stu = new Students("chaim" ,5 );
        System.out.println(stu.getName());

        stu.BookType();

        Students stuA = new Students("moshe",100,66,66,666,new ContactInfo());
        stuA.printDetails();

        Genral genral = new Genral();
        genral.setMap("1",new Students("chaim", 1076547450) );
        genral.setMap("2",new Students("daci", 100) );
        genral.setMap("3",new Students("dan", 1878655600) );
        genral.setMap("4",new Students("moshe", 1765700) );

        SetArray set = new SetArray();
        set.LinkedHashSet();
        set.TreeSet();


    }
}
