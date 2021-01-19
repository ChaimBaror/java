public class Sutdent extends Person {


    private Boolean isPay;
    private double avirch;

    public Sutdent() {
       super.firstName = firstName;
        this.isPay = false;
        this.avirch = avirch;
    }

    public Boolean getPay() {
        return isPay;
    }

    public void setPay(Boolean pay) {
        isPay = pay;
    }

    public double getAvirch() {
        return avirch;
    }

    public void setAvirch(double avirch) {
        this.avirch = avirch;
    }

    @Override
    public String toString() {
        return "Sutdent{" + '\n' +
                "isPay=" + isPay + '\n' +
                ", avirch=" + avirch + '\n' +
                ", firstName='" + firstName + '\n' +
                '}';
    }
}
