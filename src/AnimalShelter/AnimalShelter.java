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
        } else if (dogs.isEmpty()) {
            dequeueCat();
        } else if (cats.isEmpty()) {
            dequeueDog();
        } else if (dogs.peek().order < cats.peek().order) {
            dequeueDog();
        } else {
            dequeueCat();
        }
    }

    // Adopt the oldest dog //
    public void dequeueDog() {

        if (dogs.isEmpty()) {
            System.out.println("No dogs available");
        } else {
            Animal dog = dogs.poll();
            System.out.println("Adopted dog: " + dog.name);
        }
    }

    // Adopt the oldest cat //
    public void dequeueCat() {

        if (cats.isEmpty()) {
            System.out.println("No cats available");
        } else {
            Animal cat = cats.poll();
            System.out.println("Adopted cat: " + cat.name);
        }
    }
}

