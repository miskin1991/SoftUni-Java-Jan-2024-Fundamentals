package Exercises.ObjectsAndClassesExercise._06_OrderByAge;

public class Person {
    private final String name;
    private final String id;
    private final int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void printPersonData() {
        System.out.printf("%s with ID: %s is %d years old.%n", name, id, age);
    }
}
