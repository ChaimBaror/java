package CountryClub;

public class Lifeguard extends EmployeeDaily {

    protected boolean Swim;
    protected boolean resuscitate;

    public Lifeguard(int vacation, double howHours, int days, double muchPerHour, MONTH month, boolean swim, boolean resuscitate) {
        super(vacation, howHours, days, muchPerHour, month);
        this.Swim = swim;
        this.resuscitate = resuscitate;
    }
}
