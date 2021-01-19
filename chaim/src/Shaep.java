public abstract class Shaep {

    protected int Framethickness ;

    protected String color;


    public Shaep(int Framethickness,  String color) {
        this.Framethickness = Framethickness;

        this.color = color;
    }
    public abstract void getArea();

    public abstract void getPerimeter();

    public int getThickness() {
        return Framethickness;
    }

    public void setThickness(int thickness) {
        this.Framethickness = thickness;
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shaep{" +
                "Frame thickness=" + Framethickness +

                ", color='" + color + '\'' +
                '}';
    }
}
