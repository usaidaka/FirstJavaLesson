import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Main.test(); <- the way to revoke the method
        Main.hypotenuse(null);
    }

    public static void randomThings (String[] args) {
        Random random = new Random();

        int x = random.nextInt(6) + 1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

    }

    public static void hypotenuse (String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your X");
        x = scanner.nextDouble();
        System.out.println("Your Y");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is "+ z);


        scanner.close();
    }

    public static void guiFormInput (String[] args) {
        String name = JOptionPane.showInputDialog("Whats your name?");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You are "+ age+ " years old");

        double tall = Double.parseDouble((JOptionPane.showInputDialog(("How tall are you?"))));
        JOptionPane.showMessageDialog(null, "Your are "+ tall + " cm tall");
    }

    public static void expression (String[] args) {
//        increment
        int friends = 10;
        friends = friends + 1;
        friends += 1;
        friends++;
        System.out.println(friends);
//        decrement
        int enemy = 10;
        enemy = enemy - 1;
        enemy -= 1;
        enemy--;
        System.out.println(enemy);
//        modulo
        int pizza = 10;
        pizza = pizza % 2;
//        multiply and divide
        int money = 10 * 2;
        money = money * 2;
        money *= 1;

        int salary =  500000 / 2;
        salary = salary / 2;
        salary /= 1;
    }

    public static void dataType (String[] args) {
        // data type <- commonly used type
        int number = 1;
        String title = "sarjana";
        double doubleNumber = 3.14;
        boolean isTrue = true;
        char symbol = '@';
    }

    public static void prompting(String[] args) {
        // prompt() in java
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); // <-- we have to put this when we want to use scanner twice or more
        System.out.println("whats your favorite food?");
        String food = scanner.nextLine();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + "years old");
        System.out.println("Your favorite food is "+ food);

    }


}