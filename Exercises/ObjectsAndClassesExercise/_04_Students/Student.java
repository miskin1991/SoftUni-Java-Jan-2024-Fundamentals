package Exercises.ObjectsAndClassesExercise._04_Students;

public class Student {
    private final String name;
    private final String surname;

    public float getGrade() {
        return grade;
    }

    private float grade;

    public Student(String name, String surname, float grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    @Override public String toString() {
        return String.format("%s %s: %.2f", name, surname, grade);
    }
}
