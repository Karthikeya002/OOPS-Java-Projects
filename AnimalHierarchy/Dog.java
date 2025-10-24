/**
 * Dog.java
 * Concrete implementation of Animal class
 * Demonstrates inheritance and polymorphism
 */

public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void speak() {
        System.out.println(getName() + " (Dog, " + breed + ") says: Woof! Woof!");
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }
    
    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping on the dog bed.");
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void fetch() {
        System.out.println(getName() + " is fetching the ball!");
    }
}
