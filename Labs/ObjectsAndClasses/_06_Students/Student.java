package Labs.ObjectsAndClasses._06_Students;

public class Student {
    private final String name;
    private final String surname;
    private int age;
    private String hometown;

    public Student(String name, String surname, int age, String hometown) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) { this.age = age; }
    public String getHometown() {
        return hometown;
    }
    public void setHometown(String hometown) { this.hometown = hometown; }
}
