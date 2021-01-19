public class Fishs extends Animil {


    private int speedSwimming;
    public static final int lege = 0;


    public Fishs(String color, int numberLegs, int speedSawimin) {
        super(color, numberLegs);
        this.speedSwimming = speedSawimin;
    }
    public void noise(){
        System.out.println("non naes");
    }

    @Override
    public String toString() {
        return "Fishs{" +
                "speed Swimming=" + speedSwimming +
                ", color='" + color + '\'' +
                ", numberLegs=" + numberLegs +
                '}';
    }
}
