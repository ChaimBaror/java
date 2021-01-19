public abstract class cat  extends Animil implements Noiseadle{


    protected double MustacheLength;
    public static final int numLeges = 4;

    public void getNoise(){
        System.out.println("mi Yooooo");
    }

    public  void scratch(){
        System.out.println(getClass().getName()+ " is scrathing ");
    }


    public cat(String color, int numberLegs, double longWIScr) {
        super(color, numberLegs);
        this.MustacheLength = longWIScr;
    }

    @Override
    public String toString() {
        return "cat{" +
                "longWIScr=" + MustacheLength +
                ", numLeges=" + numLeges +
                ", color='" + color + '\'' +
                ", numberLegs=" + numberLegs +
                '}';
    }
}
