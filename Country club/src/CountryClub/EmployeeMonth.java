package CountryClub;

import java.util.HashMap;

public class EmployeeMonth extends Employee {
    protected MONTH month;
    protected double howMonth;
    protected double hours;
    protected double muchPerMonth;

    public EmployeeMonth() {
       
    }

    HashMap<MONTH,Double> hoursHashMap = new HashMap<>();

    public void SavesHoursMonth(MONTH month, double Hours) {
        hoursHashMap.put(month,Hours);
    }

    public void getHowHoursOfmonth(MONTH month) throws Exception {
        hoursHashMap.get(month);
        throw new Exception("Please enter a month that exists in the array");
    }


    //add salary
    public double Salary() {
        double salary = (muchPerMonth * 1.05);
        return salary;
    }
}
