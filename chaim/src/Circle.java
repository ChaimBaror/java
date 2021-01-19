public class Circle extends Shaep {


    protected double radis;

    public Circle(int Framethickness,  String color, double radis) {
        super(Framethickness,  color);
        this.radis = radis;
    }


    public void getArea(){
        System.out.println(radis*radis*Math.PI);
    }
    public void getPerimeter(){
        System.out.println((radis+radis)*Math.PI);
    }


        public double getRadis() {
        return radis;
    }

    public void setRadis(double radis) {
        this.radis = radis;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radis=" + radis +
                ", Framethickness=" + Framethickness +
                ", color='" + color + '\'' +
                '}';
    }
}
