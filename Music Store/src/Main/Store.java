package Main;

import java.util.ArrayList;

public class Store {

    protected ArrayList<Musicalnstruments> list = new ArrayList<>();

    protected ArrayList<Teachers> teacherss;


    public void add(Musicalnstruments items) {
        list.add(items);
    }

    public ArrayList<Musicalnstruments> getList() {
        return list;
    }

    public void setList(ArrayList<Musicalnstruments> list) {
        this.list = list;
    }

    public void fixGuitar(String date) throws Exception {
        for (Musicalnstruments musicalnstruments : list)
            if (musicalnstruments instanceof Guitar) {
                ((Guitar) musicalnstruments).setDateOffix(date);
            }
    }

    public void updatingPrice(int x) {
        for (Musicalnstruments musicalnstruments : list)
            musicalnstruments.setPrice(musicalnstruments.getPrice() * (x / 100) + musicalnstruments.getPrice());
    }

    public void woluom() {
        for (Musicalnstruments musicalnstruments : list) {
            if (musicalnstruments instanceof SoundType) {
                System.out.println((SoundType) musicalnstruments);
            }
        }
    }
    public int num() {
        int count = 0;
        for (Musicalnstruments musicalnstruments : list) {
            if (musicalnstruments instanceof percussion) {
                count =+((percussion) musicalnstruments).getNumPercussion();

            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Store{" +
                "list=" + list +
                ", teacherss=" + teacherss +
                '}';
    }
}

