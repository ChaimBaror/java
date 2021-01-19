package Main;

public class Booster extends Musicalnstruments implements SoundType {

    protected int BoosterSize;


    public Booster(String brand, int price, int boosterSize) {
        super(brand, price);
        BoosterSize = boosterSize;
    }

    public String SoundType() {
        return ("ROOOOOHHHWWW ");
    }


}
