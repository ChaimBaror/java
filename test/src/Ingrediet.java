public class Ingrediet {
    String name;
    int price;
    int amount;

    public Ingrediet(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingrediet{" + '\n' +
                "name='" + name + '\n' +
                "price=" + price + '\n' +
                "amount=" + amount + '\n' +
                '}';
    }
}
