package Inheritance;

import java.util.Objects;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, (int) weight, "perky", "curled");
    }

    public Dog(String type, int weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 25 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoice() {
        if (Objects.equals(type, "wolf")) {
            System.out.println("Ow Ooooow!");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.println("Woof !");
    }

    private void run() {
        System.out.println("Dog Running");
    }

    private void walk() {
        System.out.println("Dog walking");
    }

    private void wagTail() {
        System.out.println("Tail wagging");
    }
}
