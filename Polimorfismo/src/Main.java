//  A herança nos permite herdar atributos e métodos de outra classe. O polimorfismo usa esses métodos
//  para realizar diferentes tarefas. Isso nos permite realizar uma única ação de maneiras diferentes.

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}