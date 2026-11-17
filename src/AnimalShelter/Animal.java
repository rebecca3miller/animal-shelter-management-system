package AnimalShelter;

import java.util.LinkedList;

public class Animal {

    String name;
    String type;
    int order;

    // Constructor //
    public Animal(String name, String type, int order) {
        this.name = name;
        this.type = type;
        this.order = order;
    }

    // Display animal info //
    public String toString() {
        return type + ": " + name;
    }
}
