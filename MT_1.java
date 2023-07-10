class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Dog subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Cat subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Cow subclass
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos.");
    }
}

// Main class
public class MT_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();  // The animal makes a sound.

        Dog dog = new Dog();
        dog.makeSound();     // The dog barks.

        Cat cat = new Cat();
        cat.makeSound();     // The cat meows.

        Cow cow = new Cow();
        cow.makeSound();     // The cow moos.
    }
}
