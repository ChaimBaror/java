import java.util.ArrayList;

public class Scool {

    private String name;
    private Person manager;
    private String address;
    private String number_phone;
    private ArrayList<Course> schooltype = new ArrayList<>();
    private ArrayList<Grade> schoolroom = new ArrayList<>();

//{"Drawing", "Computers", "Sports", "Math", "English"};

    public Scool() {

    }

    //add Class room
    public void addClass(Grade x) {
        schoolroom.add(x);
    }

    //add class
    public void addType(Course x) {
        schooltype.add(x);
    }

    // add sutdet to class.
    public void addSutdetClass(Sutdent x, int level) {
        for (Grade grade : schoolroom) {
            if (grade.getLavelClass().ordinal() == level) {
                grade.add(x);
                break;
            }
        }
    }

    //add teacher
    public void addtether(Teacher x, int level) {
        for (Grade grade : schoolroom)
            if (grade.getLavelClass().ordinal() == level)
                grade.setTeacher(x);
    }

    // recept list of type class
    public void getTypeClass() {
        for (Course course : schooltype)
            System.out.println(course.toString());
    }

    // recept type of name
    public void typeOfName(String x) {
        for (Course course : schooltype) {
            if (course.getNameTyep() == x)
                System.out.println(course.toString());
        }
    }

    // recept all sutdent
    public void allSutdent() {
        int conut = 0;
        for (Grade grade : schoolroom) {
            conut += grade.getSutdetList().size();
        }
    }

    //recept sutdet of name class type
    public void sutOfname(String x) {
        int conut = 0;
        for (Course course : schooltype)
            if (course.getNameTyep().equals(x))
                System.out.println(course.getNameTyep());

    }

    //number not pay
    public void sutdentIspay() {
        for (Grade grade : schoolroom)
            for (int i = 0; i < grade.getSutdetList().size(); i++) {

                if (grade.getSutdetList().get(i).getPay() == false) {
                    System.out.println(grade.getSutdetList().get(i));

                }

            }
    }

    //recept of last name
    public void ofLastName() {
        for (Grade grade : schoolroom) {
            for (Person person : grade.getSutdetList())
                person.getLastName();
        }
    }

    //recept sutdent of id
    public void sutdentId(int x) {
        for (Grade grade : schoolroom) {
            for (Person person : grade.getSutdetList()) {
                if (person.getId() == x)
                    System.out.println(person.toString());
                break;
            }
        }
    }

    //recept list teachers
    public void listTeacher() {
        for (Grade grade : schoolroom) {
            System.out.println(grade.getTeacher().toString());
        }
    }

    // recept TEACHER  of first name an last name
    public void principal(String f_name, String l_nane) {
        for (Grade grade : schoolroom) {
            if (grade.getTeacher().getFirstName().equals(f_name) && grade.getTeacher().getLastName().equals(f_name)) {
                System.out.println(grade.getTeacher().toString());
                break;
            }
        }
    }

    // Getting average grades in a particular class
    public void averageClass(LAVELCLASS x) {
        int average = 0;
        int count = 0;
        for (Grade grade : schoolroom) {
            if (grade.getLavelClass().equals(x))
                for (Sutdent person : grade.getSutdetList())
                    count += person.getAvirch();
            average = count / grade.getSutdetList().size();
            System.out.println(average);
        }
    }

    // Getting average all school
    public void averageallschool() {
        int average = 0;
        int count = 0;
        int sum = 0;
        for (Grade grade : schoolroom) {
            for (Sutdent person : grade.getSutdetList()) {
                sum += person.getAvirch();
                count++;
            }
            average = sum / count;
            System.out.println(average);
        }
    }
    //Number of students goes beyond
    public void bigClass(){
       for (Grade grade: schoolroom){
           if(grade.getSutdetList().size()>grade.getMaxSutdent()){
               System.out.println(grade.toString());
           }
       }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }

    public ArrayList<Course> getSchooltype() {
        return schooltype;
    }

    public void setSchooltype(ArrayList<Course> schooltype) {
        this.schooltype = schooltype;
    }

    public ArrayList<Grade> getSchoolroom() {
        return schoolroom;
    }

    public void setSchoolroom(ArrayList<Grade> schoolroom) {
        this.schoolroom = schoolroom;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name  + '\n' +
                ", manager=" + manager  + '\n' +
                ", address='" + address  + '\n' +
                ", number phone='" + number_phone  + '\n' +
                ", school type=" + schooltype  + '\n' +
                ", school room=" + schoolroom  + '\n' +
                '}';
    }
}