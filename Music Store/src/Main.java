
import Main.*;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        Guitar guitar = new Guitar("AGF",4,"C",6,"2001");
        percussion percussion= new percussion("G",5,8);
        ElectricOrgan organ = new ElectricOrgan("TT",300,RECORDING.Analog);

        store.add(guitar);
        store.add(percussion);
        store.add(organ);

        System.out.println(store.toString());
    }

}

