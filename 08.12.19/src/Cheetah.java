public class Cheetah extends Mammals implements Runable {


    private String names;
    private int high;
    private int numAnimalAet;

    public Cheetah(String name, int age, String name1, int high, int numAnimalAet) {
        super(name, age);
        this.names = name1;
        this.high = high;
        this.numAnimalAet = numAnimalAet;
    }

    public void getrun() {
        System.out.println("this is good run ");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getNumAnimalAet() {
        return numAnimalAet;
    }

    public void setNumAnimalAet(int numAnimalAet) {
        this.numAnimalAet = numAnimalAet;
    }

    @Override
    public String toString() {
        return "Cheetah{" + '\n' +
                "name='" + name + '\'' +
                ", name='" + names + '\'' +
                ", high=" + high +
                ", age=" + age +
                ", Some prey animals =" + numAnimalAet +
                '}' + '\n';
    }
}
