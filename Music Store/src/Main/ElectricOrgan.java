package Main;

public class ElectricOrgan extends Musicalnstruments implements SoundType {

    private RECORDING recording;

    protected int numOctaves;

    public ElectricOrgan(String brand, int price, RECORDING recording) {
        super(brand, price);
        this.recording = recording;
    }

    public String SoundType() {
        return ("DO RE MI FA SOL LA CI DO ");
    }

    @Override
    public String toString() {
        return "ElectricOrgan{" +
                "recording=" + recording +
                ", numOctaves=" + numOctaves +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

