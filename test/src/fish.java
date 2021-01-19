public class fish {

    String type;
    String color;
    int age;
    String lasteedingTime;

    public fish(String type, String color, int age, String iasteedingTime) {
        this.type = type;
        this.color = color;
        this.age = age;
        this.lasteedingTime = iasteedingTime;
    }

    public void feed(String time) {
        System.out.println(" the time fish eat");
        this.lasteedingTime = time;
    }
}