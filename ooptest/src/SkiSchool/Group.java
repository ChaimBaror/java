package SkiSchool;

import java.util.Arrays;

public class Group extends Student {

    protected final int maxStudent = 10;
    protected LEVEL level;
    protected int price;
    protected Student[]students= new Student[10];

    public Group() {
        this.price = 10;
    }

    public int getMaxStudent() {
        return maxStudent;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Group{" +
                "maxStudent=" + maxStudent +
                ", level=" + level +
                ", price=" + price +
                ", students=" + Arrays.toString(students) +
                ", name='" + name + '\'' +
                ", PhoneSMS='" + PhoneSMS + '\'' +
                '}';
    }
}
