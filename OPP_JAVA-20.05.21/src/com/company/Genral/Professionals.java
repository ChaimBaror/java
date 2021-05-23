package com.company.Genral;

public abstract class Professionals extends Persons {
    protected int HoursForerwork;

    public Professionals(String name, int pgone, int hoursForerwork) {
        super(name, pgone);
        HoursForerwork = hoursForerwork;
    }
}
