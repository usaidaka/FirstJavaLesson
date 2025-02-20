package Section;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage(null);
    }

    //    challenge
    public static boolean inputThenPrintSumAndAverage (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        int average = 0;

        while (counter <= 5) {
            System.out.println("Enter Number #" + counter + ":");
            String number = scanner.nextLine();
            try {
                int parseNumb = Integer.parseInt(number);
                counter++;
                sum += parseNumb;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        average = sum / 4;
        System.out.println("SUM = " + sum + " AVG = " + average);
        return false;
    }

    //    Max and Min challenge
    public static void maxMin (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        double loopCount = 0;

        while (true) {
            System.out.println("enter a number");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if ( loopCount == 0 || validNum < min) {
                    min = validNum;
                }

                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
            if (loopCount > 0) {
                System.out.println("min = " + min + " and max = " + max);
            } else {
                System.out.println("No valid data");
            }
        }
    }

    //    Mini Challenge
    public static void validNumber (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            System.out.println("Enter Number #" + counter + ":");
            String number = scanner.nextLine();
            try {
                int parseNumb = Integer.parseInt(number);
                counter++;
                sum += parseNumb;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("so the sum of input number is : " + sum);

    }
}
