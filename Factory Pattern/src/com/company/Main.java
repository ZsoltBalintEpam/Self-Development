package com.company;

public class Main {

    public static void main(String[] args) {
	    String animalType = args[0];

        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createAnimal(animalType);
        animal.eat();
    }
}
