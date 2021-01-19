package SkiSchool;

public class Private extends Student {
    private int price;
    private String location;
    private Lnstructor lnstructor;


    public Private() {
        this.price = 50;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Private{" +
                "price=" + price +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", PhoneSMS='" + PhoneSMS + '\'' +
                '}';
    }
}
