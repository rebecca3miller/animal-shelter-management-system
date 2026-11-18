package AnimalShelter;

public class Main {

    public static void main(String[] args) {

        AnimalShelter shelter = new AnimalShelter();

        // Add animals to the shelter //
        shelter.enqueue("Lucky", "dog");
        shelter.enqueue("Max", "cat");
        shelter.enqueue("Buddy", "dog");
        shelter.enqueue("Maggie", "dog");

        // Adopt the oldest animal //
        shelter.dequeueAny();

        // Adopt the oldest dog //
        shelter.dequeueDog();

        // Adopt the oldest cat //
        shelter.dequeueCat();

        // Adopt the remaining animal //
        shelter.dequeueAny();

        // Test empty shelter //
        AnimalShelter emptyShelter = new AnimalShelter();

        emptyShelter.dequeueAny();
        emptyShelter.dequeueDog();
        emptyShelter.dequeueCat();

        // Test shelter with only cats //
        AnimalShelter catShelter = new AnimalShelter();

        catShelter.enqueue("Luna", "cat");
        catShelter.enqueue("Moo", "cat");

        catShelter.dequeueAny();
        catShelter.dequeueAny();

        // Test shelter with only dogs //
        AnimalShelter dogShelter = new AnimalShelter();

        dogShelter.enqueue("Buddy", "dog");
        dogShelter.enqueue("Max", "dog");

        dogShelter.dequeueAny();
        dogShelter.dequeueAny();

        // Testing first in first out //
        AnimalShelter fifoShelter = new AnimalShelter();

        fifoShelter.enqueue("Luna", "cat");
        fifoShelter.enqueue("Buddy", "dog");
        fifoShelter.enqueue("Bella", "cat");
        fifoShelter.enqueue("Max", "dog");

        fifoShelter.dequeueAny();
        fifoShelter.dequeueAny();
        fifoShelter.dequeueAny();
        fifoShelter.dequeueAny();
    }
}
