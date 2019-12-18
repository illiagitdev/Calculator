package lesson17_12_19.main;

//@JsonIgnoreProperties
public class User {
    private String gender;
    private int id;
    private String name;
    private int salary;
    private String surname;

    public User(String gender, int id, String name, String surname, int salary) {
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.surname = surname;
    }

    public User() {
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "gender='" + gender + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", surname='" + surname + '\'' +
                '}' + "\n";
    }
}
