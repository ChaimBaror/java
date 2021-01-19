public abstract class Animil {

    protected String color;
    protected int numberLegs;

    public Animil(String color, int numberLegs) {
        this.color = color;
        this.numberLegs = numberLegs;
    }

//    public  abstract void noise();



    @Override
    public String toString() {
        return  getClass().getName()  +
                "color='" + color + '\n' +
                ", numberLegs=" + numberLegs +
                '}';
    }
}
