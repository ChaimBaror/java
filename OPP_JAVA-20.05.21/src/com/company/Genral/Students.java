package com.company.Genral;

public class Students extends Persons implements Bookable {
    protected int rating;
    protected int average;
    protected int howMuchToPay;
    protected ContactInfo ContactInfo;



    public Students(String name, int phone, int rating, int average, int howMuchToPay,ContactInfo contactInfo) {
        super(name, phone);
        this.rating = rating;
        this.average = average;
        this.howMuchToPay = howMuchToPay;
        ContactInfo = contactInfo;
    }

    public Students(String name, int phone) {
        super(name , phone);
    }

    public void printDetails(){
        System.out.println(String.format("i`m a Students First name : %s phone numbuer : %s" , super.name,super.phone ));
    }

    @Override
    public ClassRoom BookType() {
        return ClassRoom.JAVA;
    }
}
