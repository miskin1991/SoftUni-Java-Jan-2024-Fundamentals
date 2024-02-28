package Exercises.ObjectsAndClassesExercise._07_GroomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>(this.capacity);
    }

    public void add(Pet pet) {
        if (data.size() < this.capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(pet -> pet.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        return data.stream()
                .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst().orElse(null);
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        String status = String.format("The grooming salon has the following clients:%n");
        for (Pet pet : data) {
            status += String.format("%s %s%n", pet.getName(), pet.getOwner());
        }
        return status;
    }
}
