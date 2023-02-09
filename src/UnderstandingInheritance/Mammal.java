package UnderstandingInheritance;

public class Mammal extends Animal {
    public void move() {
        System.out.println("I am moving like an animal!");
    }

    public void move(String bodyPart) {
        System.out.println("I am moving like a Mammal!");
    }

    public void anotherMove() {
        System.out.println("This is another move o");
    }

}
