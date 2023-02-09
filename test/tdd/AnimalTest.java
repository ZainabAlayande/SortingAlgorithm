package tdd;

import UnderstandingInheritance.Animal;
import UnderstandingInheritance.Cat;
import UnderstandingInheritance.Dog;
import UnderstandingInheritance.Mammal;
import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    public void test_for_dog() {
        Dog dog = new Dog();
        dog.move("What");
        dog.anotherMove();
        dog.move();
    }
    @Test
    public void test_cat() {
        Cat cat = new Cat();

    }

    @Test
    public void test_for_animal() {
        Animal animal = new Animal();
        animal.move();
    }

    @Test
    public void test_for_mammal() {
        Mammal mammal = new Dog();
        mammal.move();
    }
}
