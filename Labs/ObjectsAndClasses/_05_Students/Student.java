package Labs.ObjectsAndClasses._05_Students;

public class Student {
    private final String name;
    private final String surname;
    private final int age;
    private final String hometown;

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

    public String getHometown() {
        return hometown;
    }
}
