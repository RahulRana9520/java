// Define an Interface
interface Animal {
    void makeSound();  // Abstract method (no body)
}

// Implementing Interface in a Class
class Dog implements Animal {
    public void makeSound() {  // Must provide implementation
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound();  // Calls Dog's makeSound()
        myCat.makeSound();  // Calls Cat's makeSound()
    }
}
