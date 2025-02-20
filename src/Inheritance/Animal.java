package Inheritance;

public class Animal {
    private String type;
    private String huge;
    private int weight;

    public Animal(String type, String huge, int weight) {
        this.type = type;
        this.huge = huge;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", huge='" + huge + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move (String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoice() {
        System.out.println(type + " make some kind of noice");
    }
}
