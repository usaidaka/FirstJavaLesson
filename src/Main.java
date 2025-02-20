import Inheritance.Animal;
import Inheritance.Dog;
import Section.UserInput;
import oopOne.Account;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 200);
        doAnimalStuff(animal, "fast");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff (Animal animal, String speed) {
        animal.makeNoice();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______");
    }
}