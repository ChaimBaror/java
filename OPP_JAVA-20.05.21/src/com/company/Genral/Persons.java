package com.company.Genral;

public abstract class  Persons {
    protected  String name;
    protected  int phone;

    public Persons(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
    public void printDetails(){
        System.out.println(String.format("First name : %s phone numbuer : %s" ,name,phone ));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
