public class Sprinter extends Person implements Runable, Comparable<Sprinter> {


    private int avirchRannr;

    public Sprinter(String firstName, String lastName, int age, int avirchRannr) {
        super(firstName, lastName, age);
        this.avirchRannr = avirchRannr;
    }


    @Override
    public int compareTo(Sprinter Sprinter) {
        return firstName.compareTo(Sprinter.firstName);
    }


    public void getrun() {
        System.out.println("this is run very fast ");
    }

    public void breath() {
        System.out.println("Breathing well and very healthy ");
    }

    public int getAvirchRannr() {
        return avirchRannr;
    }

    public void setAvirchRannr(int avirchRannr) {
        this.avirchRannr = avirchRannr;
    }

    @Override
    public String toString() {
        return "Sprinter{" + '\n' +

                ", firstName=' " + firstName + '\'' +
                ", lastName=' " + lastName + '\'' +
                ", age = " + age +
                "  avirchRannr = " + avirchRannr +
                '}'+ '\n' ;
    }
}
