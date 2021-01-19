public class SiamiCat extends cat {


    protected String fibritFood;

    public SiamiCat(String color, int numberLegs, double MustacheLength, String fibritFood) {
        super(color, numberLegs, MustacheLength);
        this.fibritFood = fibritFood;
    }

    public void noise(){
        System.out.println(" mi mi");


    }

    @Override
    public String toString() {
        return "SiamiCat{" +
                "fibritFood='" + fibritFood + '\'' +
                ", Mustache Length=" + MustacheLength +
                ", color='" + color + '\'' +
                ", numberLegs=" + numberLegs +
                '}';
    }
}
