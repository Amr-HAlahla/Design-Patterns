package factory.animal;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Barking!");
    }
}
