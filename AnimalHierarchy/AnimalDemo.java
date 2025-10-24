/**
 * AnimalDemo.java
 * Demonstrates inheritance and polymorphism with animals
 * Shows how subclasses override parent class methods
 */

public class AnimalDemo {
    public static void main(String[] args) {
        System.out.println("=== Animal Hierarchy System ===");
        System.out.println();
        
        // Create animals
        Dog dog1 = new Dog("Buddy", 5, "Golden Retriever");
        Dog dog2 = new Dog("Max", 3, "Labrador");
        Cat cat1 = new Cat("Whiskers", 4, "Orange");
        Cat cat2 = new Cat("Shadow", 6, "Black");
        
        System.out.println("--- Dog 1: Buddy (Golden Retriever) ---");
        dog1.speak();
        dog1.eat();
        dog1.fetch();
        System.out.println();
        
        System.out.println("--- Dog 2: Max (Labrador) ---");
        dog2.speak();
        dog2.sleep();
        dog2.fetch();
        System.out.println();
        
        System.out.println("--- Cat 1: Whiskers (Orange) ---");
        cat1.speak();
        cat1.eat();
        cat1.purr();
        System.out.println();
        
        System.out.println("--- Cat 2: Shadow (Black) ---");
        cat2.speak();
        cat2.scratch();
        cat2.sleep();
        System.out.println();
        
        // Polymorphic array demonstration
        System.out.println("=== Polymorphic Behavior ===");
        Animal[] animals = { dog1, dog2, cat1, cat2 };
        System.out.println();
        System.out.println("All animals speaking:");
        for (Animal animal : animals) {
            animal.speak();
        }
        
        System.out.println();
        System.out.println("All animals eating:");
        for (Animal animal : animals) {
            animal.eat();
        }
        
        System.out.println();
        System.out.println("All animals sleeping:");
        for (Animal animal : animals) {
            animal.sleep();
        }
    }
}
