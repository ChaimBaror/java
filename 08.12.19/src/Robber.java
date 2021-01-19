public class Robber extends Person implements Runable, Comparable<Robber> {


    private double high;
    private int numCheck;

    public Robber(String firstName, String lastName, int age, double high, int numCheck) {
        super(firstName, lastName, age);
        this.high = high;
        this.numCheck = numCheck;
    }

    public void getrun() {
        System.out.println("this is run terrible ");
    }

    public int compareTo(Robber robber) {
        if (numCheck < robber.numCheck)
            return -1;
        else if (numCheck > robber.numCheck)
            return 1;
        return 0;

    }

    public void steal() {
        System.out.println("It's a bad thief");

    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public int getNumCheck() {
        return numCheck;
    }

    public void setNumCheck(int numCheck) {
        this.numCheck = numCheck;
    }

    @Override
    public String toString() {
        return "Robber{" + '\n' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "  high=" + high +
                ", age=" + age +
                ", Several times he was caught =" + numCheck +
                '}' + '\n';
    }
}


