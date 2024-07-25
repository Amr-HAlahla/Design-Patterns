package factory.animal;

public class Donkey implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Braying!");
    }
}
