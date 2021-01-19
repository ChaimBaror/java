import java.util.ArrayList;

public class Grade {

    private LAVELCLASS lavelClass;
    private ArrayList<Sutdent> sutdetList;
    private  int maxSutdent ;
    private Teacher teacher;

    public Grade() {
    }

    public void add(Sutdent x) {
        if (x.getEag() == lavelClass.ordinal() + 5 || x.getEag() == lavelClass.ordinal() + 6)
            this.sutdetList.add(x);
        else {
            System.out.println(" is nun faind ");
        }
    }

    //remove sutdent of id
    public void removeOfId(int x) {
        for (Person person : sutdetList) {
            if (person.getId() == x)
                sutdetList.remove(person);
        }
    }
    // avrege grage
    public void avregeOf() {
        int count = 0;
        int avrege =0;
        int sum =0;
        for (Sutdent person : sutdetList){
            sum+= person.getAvirch();
            count++;
            avrege = sum /count;
            System.out.println(avrege);
        }
    }
    //add teacher
    public void addTeacher(Teacher x){
        setTeacher(x);


    }
    public void Grade(LAVELCLASS lavelClass) {
        this.lavelClass = lavelClass;
    }

    public ArrayList<Sutdent> getSutdetList() {
        return sutdetList;
    }

    public LAVELCLASS getLavelClass() {
        return lavelClass;
    }

    public void setLavelClass(LAVELCLASS lavelClass) {
        this.lavelClass = lavelClass;
    }

    public void setSutdetList(ArrayList<Sutdent> sutdetList) {
        this.sutdetList = sutdetList;
    }

    public void addsutdetList(Sutdent x) {
        sutdetList.add(x);
    }

    public void setMaxSutdent(int maxSutdent) {
        this.maxSutdent = maxSutdent;
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
        return "Grade{"  + '\n' +
                "lavelClass=" + lavelClass  + '\n' +
                ", sutdetList=" + sutdetList  + '\n' +
                ", maxSutdent='" + maxSutdent  + '\n' +
                ", teacher='" + teacher  + '\n' +
                '}';
    }
}

