
public class Person {
    public static int count = 1000;


    protected String firstName;
    protected String lastName;
    protected int id;
    protected int age;
    protected String addsass;
    private int num;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEag() {
        return age;
    }

    public void setEag(int eag) {
        this.age = eag;
    }

    public String getAddsass() {
        return addsass;
    }

    public void setAddsass(String addsass) {
        this.addsass = addsass;
    }







    public Person() {
        count++;
        this.num = count;
        this.firstName = firstName;
        this.lastName = lastName;

        this.id = count;
        this.age = 10;
        this.addsass = " beni brak";



    }

    @Override
    public String toString() {
        return "Person{number " + num + '\n' +
                ", firstName='" + firstName + '\n' +
                ", lastName='" + lastName + '\n' +
                ", id=" + id +
                ", age=" + age +
                ", addsass='" + addsass + '\n' +

                '}';
    }
}

