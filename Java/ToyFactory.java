/**
 * ToyFactory
 * 
 * Factory is a design pattern in common usage. Please implement a ToyFactory which can generate proper toy based on the given type.
 * 
 * Example
ToyFactory tf = ToyFactory();
Toy toy = tf.getToy('Dog');
toy.talk(); 
>> Wow

toy = tf.getToy('Cat');
toy.talk();
>> Meow
 * 
 * Your object will be instantiated and called as such:
 * ToyFactory tf = new ToyFactory();
 * Toy toy = tf.getToy(type);
 * toy.talk();
 */
interface Toy {
    void talk();
}

class Dog implements Toy {
    public void talk() {
        System.out.println("Wow");
    }
}

class Cat implements Toy {
    public void talk() {
        System.out.println("Meow");
    }
}

public class ToyFactory {
    /**
     * @param type a string
     * @return Get object of the type
     */
    public Toy getToy(String type) {
        if (type.equals("Dog")) {
            return new Dog();
        }
        if (type.equals("Cat")) {
            return new Cat();
        }
        return null;
    }
}