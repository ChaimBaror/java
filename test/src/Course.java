import java.util.ArrayList;

public class Course {
    private String nameTyep;
    private double timeStart;
    private double timefinish;
    private int pries;
    private ArrayList<Sutdent> sutdetList;
    private  int maxSutdent;
    private Teacher teacher;

    //add sutdent
    public void addSutdent(Sutdent x) {
        if (!sutdetList.equals(x))
            sutdetList.add(x);
    }

    //remove of Id
    public void removeId(int x) {
        for (Sutdent person : sutdetList) {
            if (person.getId() == x)
                sutdetList.remove(person);
            break;
        }
    }

    public String getNameTyep() {
        return nameTyep;
    }

    public void setNameTyep(String nameTyep) {
        this.nameTyep = nameTyep;
    }

    public double getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(double timeStart) {
        this.timeStart = timeStart;
    }

    public double getTimefhinsh() {
        return timefinish;
    }

    public void setTimefhinsh(double timefhinsh) {
        this.timefinish = timefhinsh;
    }

    public int getPries() {
        return pries;
    }

    public void setPries(int pries) {
        this.pries = pries;
    }

    public ArrayList<Sutdent> getSutdetList() {
        return sutdetList;
    }

    public void setSutdetList(ArrayList<Sutdent> sutdetList) {
        this.sutdetList = sutdetList;
    }

    public int getMaxSutdent() {
        return maxSutdent;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    @Override
    public String toString() {
        return "Course{" +
                "nameTyep='" + nameTyep  + '\n' +
                ", timeStart=" + timeStart  + '\n' +
                ", timefinish=" + timefinish  + '\n' +
                ", pries=" + pries  + '\n' +
                ", sutdetList=" + sutdetList  + '\n' +
                ", maxSutdent=" + maxSutdent  + '\n' +
                ", teacher='" + teacher  + '\n' +
                '}';
    }
}
