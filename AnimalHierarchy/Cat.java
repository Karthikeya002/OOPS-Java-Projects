/**
 * Cat.java
 * Concrete implementation of Animal class
 * Demonstrates inheritance and polymorphism
 */

public class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    @Override
    public void speak() {
        System.out.println(getName() + " (Cat, " + color + ") says: Meow! Meow!");
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food.");
    }
    
    @Override
    public void sleep() {
        System.out.println(getName() + " is napping in the sun.");
    }
    
    public String getColor() {
        return color;
    }
    
    public void scratch() {
        System.out.println(getName() + " is scratching the furniture!");
    }
    
    public void purr() {
        System.out.println(getName() + " is purring contentedly.");
    }
}
