package CountryClub;

public class Massager extends EmployeeDaily {

    protected boolean Massager;

    public Massager(int vacation, double howHours, int days, double muchPerHour, MONTH month, boolean massager) {
        super(vacation, howHours, days, muchPerHour, month);
        Massager = massager;
    }
}
