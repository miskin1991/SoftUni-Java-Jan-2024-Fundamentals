package Exercises.ObjectsAndClassesExercise._05_VehicleCatalogue;

public class Vehicle {
    public String type;
    public String model;
    public String color;
    public int hp;

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHp() {
        return hp;
    }

    public void setType(String type) {
        if (type.equals("car")) this.type = "Car";
        else this.type = "Truck";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Vehicle(String type, String model, String color, int hp) {
        setType(type);
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public void printVehicleData() {
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Horsepower: " + hp);
    }
}
