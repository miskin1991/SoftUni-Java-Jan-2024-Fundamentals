package Exercises.ObjectsAndClassesExercise._03_OpinionPoll;

public class Person {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private final String name;
    private final int age;
    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override public String toString() {
        return String.format("%s - %d", name, age);
    }
}
