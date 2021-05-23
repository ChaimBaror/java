package com.company.Genral;
import java.util.ArrayList;
import java.util.HashMap;

public class Genral  {
    private ArrayList<Persons> persons = new ArrayList<Persons>();

    private HashMap<String ,Students> map = new HashMap<String, Students>();

    public Genral (){
        Teachers teachers = new Teachers("iri" , 052747474,0,ClassRoom.JAVA);
        Teachers teachers2 = new Teachers("arial" , 052324324,40,ClassRoom.ANGULAR);
        Students students  = new Students ("yoel",052767676);
        Students students2  = new Students ("aaron",987978999);

        persons.add(teachers);
        persons.add(teachers2);
        persons.add(students);
        persons.add(students2);

    }

    public void toPrint() {
        for(Persons p :persons ){
            p.printDetails();
        }
    }

    public void setMap(String key , Students val ) {
        this.map.put(key,val );
        System.out.println(map.toString());
    }
}
