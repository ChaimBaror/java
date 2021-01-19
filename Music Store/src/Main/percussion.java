package Main;

public  class percussion extends Musicalnstruments implements SoundType {
    private int numPercussion;

    public percussion(String brand, int price, int numPercussion) {
        super(brand, price);
        this.numPercussion = numPercussion;
    }

    public int getNumPercussion() {
        return numPercussion;
    }

    public void setNumPercussion(int numPercussion) {
        this.numPercussion = numPercussion;
    }

    public String SoundType() {
        return ("tok tock ");
    }

    @Override
    public String toString() {
        return "percussion{" +
                "numPercussion=" + numPercussion +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
