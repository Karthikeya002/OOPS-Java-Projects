// Animal.java - Base class showing Inheritance
// This class demonstrates the parent class in an inheritance hierarchy

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
    public abstract void move();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Dog.java - Subclass
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    public void move() {
        System.out.println(name + " is running on four legs");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}

// Cat.java - Subclass
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    public void move() {
        System.out.println(name + " is walking gracefully");
    }

    public void scratch() {
        System.out.println(name + " is scratching");
    }
}
