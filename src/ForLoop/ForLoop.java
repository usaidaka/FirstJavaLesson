package ForLoop;

public class ForLoop {
    public static void main(String[] args) {

    }

//    Mini Challenge
    public static int sumDigits (int num) {
        if (num < 0) {
            return -1;
        }
        int sum = 0;
        while (sum <= num) {
            sum += num % 10;
            num = num / 10;
        }
        sum += num;
        System.out.println(sum);
        return sum;
    }

//    Mini Challenge
    public static void modifyTheEven (String[] args) {
        int start = 4;
        int finish = 20;
        int totalEven = 0;
        int totalOdd = 0;

        while (start <= finish) {
            start++;
            if (!isEvenNumber(start)){
                totalEven++;
                continue;
            }
            System.out.println("Even Number " + start);
            totalOdd++;

            if (totalEven >= 5) {
                break;
            }
        }
        System.out.println("even : " + totalEven);
        System.out.println("odd: " + totalOdd );

    }

    public static void requestEven (String[] args) {
        int start = 4;
        int finish = 20;
        String evenList = "";

        while (start <= finish) {
            start++;
            if (!isEvenNumber(start)){
            continue;
            }
            System.out.println("the even number : "+ start);
        }
    }

    public static boolean isEvenNumber (int num) {
        return num % 2 == 0;
    }

//    WHILE AND DO WHILE LOOP
    public static void whileAndDoWhile (String[] args) {
        // for loop
        for (int i = 1 ; i <= 5 ; i++) {
            System.out.println("from for loop : " + i);
        }

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.println("from while loop " + j);
            j++;
        }

        // do while loop
        boolean isRun = false;
        int k = 1;
        do {
            if (k > 5) {
                break;
            }
            System.out.println("from do while : " + k);
            k++;
            isRun = (k > 0);
        } while (isRun);
    }



//    Mini Challenge
    public static void sum3And5 (String[] args) {
        int sum = 0;
        int count = 0;
        for (int start = 1 ; start < 1000 ; start++) {
            if (start % 3 == 0 && start % 5 == 0) {
                count++;
                sum += start;
                System.out.println("found a match " + start);
            }
            if (count == 5) {
                System.out.println(start + " can be divided by 3 and 5");
                break;
            }
        }
        System.out.println("sum up " + sum);
    }

//    Mini Challenge
    public static void countAllPrime (String[] args) {
        int count = 0;
        for (int i = 10 ; i < 50 ; i++) {
            if (isPrimeNumber(i)) {
                System.out.println("number" + i + " is a prime number");
                count++;
                if (count == 3) {
                    System.out.println("its braak at count = " + count);
                    break;
                }
            }
        }
                System.out.println("total prime is " + count);
    }

    public static void primeNumberPrint (int num) {
        for (int start = 0 ; start < num ; start++) {
            System.out.println(start + " " + (isPrimeNumber(start) ? " is" : " is not") + " prime number" );
        }
    }

    public static boolean isPrimeNumber (int num) {
        if (num <= 2) {
            return (num == 2);
        }
        for (int divisor = 2; divisor <= num/2 ; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }

//    Mini Challenge
    public static void calculateInterestMiniChallenge (String[] args) {
        for (double rate = 7.5 ; rate <= 10 ;  rate += 0.25) {
            double dollarAmount = 100 * (rate / 100);
            if (dollarAmount > 8.5) {
                break;
            }
            System.out.println("calculate dolar of 100 with rate " + rate + "% is " + dollarAmount);
        }
    }

// ============== START =============
    public static void detailCalculateRateInterest (double rate) {
        for (rate = 2.0 ; rate <= 5.0 ; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + " % interest = " + interestAmount);
        }
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
// ============== END =============

    public static void countPercentage (String[] args) {
        int salary = 10_000_000;

        for (int i = 1 ; i <= 5 ; i++) {
            System.out.println(salary * (i/100d));
        }
    }


}
