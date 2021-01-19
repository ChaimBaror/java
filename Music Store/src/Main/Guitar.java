package Main;

public class Guitar extends Musicalnstruments implements SoundType{

    protected String guitarType;
    protected int numberMetrim;
    protected String dateOffix;

    public Guitar(String brand, int price, String guitarType, int numberMetrim, String dateOffix) {
        super(brand, price);
        this.guitarType = guitarType;
        this.numberMetrim = numberMetrim;
        this.dateOffix = dateOffix;
    }

    public String SoundType(){
       return ("do ra mi fa sol la ci ");
    }

    public String getDateOffix() {
        return dateOffix;
    }

    public void setDateOffix(String dateOffix) {
        this.dateOffix = dateOffix;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "guitarType='" + guitarType + '\n' +
                ", numberMetrim=" + numberMetrim +
                ", dateOffix='" + dateOffix + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
