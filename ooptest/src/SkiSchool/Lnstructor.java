package SkiSchool;

public class Lnstructor {

    protected String name;
    protected String phoneSMS;
    protected boolean Certified;
    protected LESSONS type1;
    protected LESSONS type2;

    public Lnstructor( String name, String phoneSMS, boolean certified) {

        this.name = name;
        this.phoneSMS = phoneSMS;
        this.Certified = certified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneSMS() {
        return phoneSMS;
    }

    public void setPhoneSMS(String phoneSMS) {
        this.phoneSMS = phoneSMS;
    }

    public boolean isCertified() {
        return Certified;
    }

    public void setCertified(boolean certified) {
        Certified = certified;

    }

    @Override
    public String toString() {
        return "Lnstructor{" +
                "name='" + name + '\'' +
                ", phoneSMS='" + phoneSMS + '\'' +
                ", Certified=" + Certified +
                ", type1=" + type1 +
                ", type2=" + type2 +
                '}';
    }
}
