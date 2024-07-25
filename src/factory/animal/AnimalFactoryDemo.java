package factory.animal;

import java.io.*;

public class AnimalFactoryDemo {
    public static void main(String[] args) throws IOException {
        animalsFactory animalsFactory = new animalsFactory();

        System.out.println("Enter the name of the animal you want to simulate: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String animalName = br.readLine();
            Animal animal = animalsFactory.createAnimal(animalName);
            if (animal == null) {
                System.out.println("Chosen animal isn't available to simulate, invalid option!");
            } else {
                System.out.print("Simulation the " + animalName + " sound: ");
                animal.makeSound();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
