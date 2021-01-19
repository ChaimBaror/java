package SkiSchool;

public abstract class  Student {

    protected String name;
    protected String PhoneSMS;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", PhoneSMS='" + PhoneSMS + '\'' +
                '}';
    }
}
