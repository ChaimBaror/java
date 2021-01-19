public class Horsh extends Animil implements Noiseadle {

    protected int tailHorse;
    public static final int numLege = 4;

    public void getNoise() {
        System.out.println("ho ao ho ");
    }

    public Horsh(String color, int numberLegs, int tainHorse) {
        super(color, numberLegs);
        this.tailHorse = tainHorse;
    }

    public void rideHorse(){
        System.out.println("i`m rideing");
    }

    @Override
    public String toString() {
        return "Horsh{" +
                "tail Horse=" + tailHorse +
                ", color='" + color + '\'' +
                ", numberLegs=" + numberLegs +
                '}';
    }
}
