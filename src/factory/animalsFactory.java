package factory;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Barking!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meowing!");
    }
}

class Donkey implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Braying!");
    }
}

class animalsFactory {
    // use createAnimal to get the animal object
    public Animal createAnimal(String animalName) {
        if (animalName == null) {
            return null;
        }
        if (animalName.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (animalName.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (animalName.equalsIgnoreCase("donkey")) {
            return new Donkey();
        }
        return null;
    }
}

