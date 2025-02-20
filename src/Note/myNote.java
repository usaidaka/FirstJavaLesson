package Note;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class myNote {
    public static void main(String[] args) {
//        Exception Error in Java
//        try {
//        System.out.println(getInputFromConsole(currentYear));
//        } catch (NullPointerException e) {
//        System.out.println(getInputFromScanner(currentYear));
//        }
    }

    //   Reading data from input
    public static String getInputFromConsole (int currentYear) {
        String name = System.console().readLine("Hi, Whats your name?");
        System.out.println("Hi " + name + ", nice to meet you");

        String dateOfBirth = System.console().readLine("what year were tou born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        System.out.println("i am " + age + " years old");
        return "";
    }

    public static String getInputFromScanner (int currentYear) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean validDOB = false;

//        System.out.println("What year were you born?");
//        String dateOfBirth = scanner.nextLine();
//        int age = currentYear - Integer.parseInt(dateOfBirth); <- this 2 lines we convert to using the checkYearBordMethod
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
            try {
                age = checkYearBorn(currentYear, scanner.nextLine());
            } catch (NumberFormatException badUserData) {
                System.out.println("Character not allowed!! Try again!");
            }
            validDOB = age < 0 ? false : true;
        } while (!validDOB);

        return "So you are " + age + " years Old";
    }

    public static int checkYearBorn (int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }

    //    Parsing values and reading input using System.console()
    public static void parsingValue (String[] args) {
        String year = "2025";
        String nextYear = "2026";

        // plus will concat those both value
        System.out.println("sum up the string " + year + nextYear); // will return 20252026 not sum of them in integer

        // parsing the integer
        int parseYear = Integer.parseInt(year);
        int parseNextYear = Integer.parseInt(nextYear);
        // plus will sum up those both value
        System.out.println("sum up the integer " + (parseYear + parseNextYear));

        // parsing the double
        String minute = "22.5";
        double parseMinute = Double.parseDouble(minute);
        System.out.println("parsing double string " + parseMinute);
    }

    public static void ifStatement (String[] args) {
        int age = 22;

        if (age == 22) {
            System.out.println("you are young!");
        }

        int score = 99;
        if (score >= 80) {
            System.out.println("congratulation, you passed the test!");
        } else {
            System.out.println("try again!");
        }
    }

    public static void randomThings (String[] args) {
        Random random = new Random();

        int x = random.nextInt(6) + 1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
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
        System.out.println(pizza);
//        multiply and divide
        int money = 10 * 2;
        money = money * 2;
        money *= 1;
        System.out.println(money);
        int salary =  500000 / 2;
        salary = salary / 2;
        salary /= 1;
        System.out.println(salary);
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
