package AnimalShelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {

    // Queue for dogs and cats //
    Queue<Animal> dogs =  new LinkedList<>();
    Queue<Animal> cats = new LinkedList<>();

    int order = 0;

    // Add animal to the shelter //
    public void enqueue(String name, String type) {

        if (type.equalsIgnoreCase("dog")) {
            Animal animal = new Animal(name, "Dog", order);
            dogs.offer(animal);
            order++;
        }

        if (type.equalsIgnoreCase("cat")) {
            Animal animal = new Animal(name, "Cat", order);
            cats.offer(animal);
            order++;
        } else {
            System.out.println("AnimalShelter: Unknown animal type");
        }
    }

    // Adopt the oldest animal //
    public void dequeueAny() {

        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("No animals available");
        }
    }
}
