public class StreeCat extends cat {

    protected int numberfights;

    public StreeCat(String color, int numberLegs, double MustacheLength, int numberfights) {
        super(color, numberLegs, MustacheLength);
        this.numberfights = numberfights;
    }

        public void noise(){
        System.out.println("mi Yooooo");
    }

    @Override
    public String toString() {
        return "StreeCat{" +
                "number fights=" + numberfights +
                ", Mustache Length=" + MustacheLength +
                ", numLeges=" + numLeges +
                ", color='" + color + '\n' +
                ", numberLegs=" + numberLegs +
                '}';
    }
}
