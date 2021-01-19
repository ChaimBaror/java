package CountryClub;

import java.util.Enumeration;
import java.util.HashMap;

public class EmployeeDaily extends Employee {
    protected int Vacation = 0;

    protected double howHours;
    protected int days;
    protected double muchPerHour;
    protected MONTH month;

    public EmployeeDaily(int vacation, double howHours, int days, double muchPerHour, MONTH month) {
        Vacation = vacation;
        this.howHours = howHours;
        this.days = days;
        this.muchPerHour = muchPerHour;
        this.month = month;
        this.hoursHashMap = hoursHashMap;
    }

    HashMap<MONTH,Double>hoursHashMap=new HashMap<>();

    public void PutMonthAndHours(MONTH month,double howHours){
        hoursHashMap.put(month,howHours);
    }


}
