import Inheritance.Animal;
import Inheritance.Dog;
import Inheritance.Fish;
import InheritanceWorkerChallenge.Employee;
import InheritanceWorkerChallenge.HourlyEmployee;
import InheritanceWorkerChallenge.SalariedEmployee;
import Section.UserInput;
import oopOne.Account;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static <SalariedEmployeeEmployee> void main(String[] args) {
//        Animal animal = new Animal("Generic Animal", "Huge", 200);
//        doAnimalStuff(animal, "fast");
//
//        Dog dog = new Dog();
//        doAnimalStuff(dog, "fast");
//
//        Dog yorkie = new Dog("Yorkie", 15);
//        doAnimalStuff(yorkie, "fast");
//
//        Dog retriever = new Dog("Labrador Retriever", 65, "floopy", "swimmer");
//        doAnimalStuff(retriever, "slow");
//
//        Dog wolf = new Dog("wolf", 62);
//        doAnimalStuff(wolf,"slow");
//
//        Fish fish = new Fish("GoldFish", 1, 22, 10);
//        doAnimalStuff(fish, "fast");

        Employee tim = new Employee("tim", "12/02/1999", "3/3/2025");
        System.out.println(tim);
        System.out.println(tim.getAge());
        System.out.println(tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "02/01/1999", "3/3/2025", 35000);
        System.out.println(joe);
        System.out.println("Joe's pay check " + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "02/01/1999", "05/05/2024", 15);
        System.out.println(mary);
        System.out.println("Mary's pay check = $" + mary.collectPay());
        System.out.println("Mary's Holidays Pay = $" + mary.getDoublePay());

    }

    public static void doAnimalStuff (Animal animal, String speed) {
//        animal.makeNoice();
//        animal.move(speed);
//        System.out.println(animal);
//        System.out.println("_______");
    }
}