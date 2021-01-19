package Main;

public abstract class Musicalnstruments {

    protected String brand;
    protected int price;


    public Musicalnstruments(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


