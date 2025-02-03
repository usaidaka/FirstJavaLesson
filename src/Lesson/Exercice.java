package Lesson;

public class Exercice {
    public static void main(String[] args) {
        hasSameLastDigit(20, 90, 31);
    }

    //    last digit checker
    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        boolean isTrue = true;
        boolean isShared = false;
        if ((num1 < 10 || num2 < 10 || num3 < 10) || (num1 > 1000 || num2 > 1000 || num3 > 1000)) {
            isTrue = false;
        }

        if (isTrue) {
            int lastDigitNum1 = num1 % 10;
            int lastDigitNum2 = num2 % 10;
            int lastDigitNum3 = num3 % 10;
            isShared = lastDigitNum1 == lastDigitNum2 || lastDigitNum1 == lastDigitNum3 || lastDigitNum2 == lastDigitNum3;
        }
        return isTrue && isShared;
    }

    //    Shared Digit
    public static boolean sharedDigit(int num1, int num2) {
       boolean isTrue = true;
       boolean isSharedBoth = false;
       if ((num1 < 10 || num2 < 10) || (num1 > 99 || num2 > 99)) {
           isTrue = false;
       }
       if (isTrue) {
           int firstDigitNum1 = num1 / 10;
           int secondDigitNum1 = num1 % 10;

           int firstDigitNum2 = num2 / 10;
           int secondDigitNum2 = num2 % 10;

           boolean compareFirstDigitNum1 = firstDigitNum1 == firstDigitNum2 || firstDigitNum1 ==  secondDigitNum2;
           boolean compareSecondDigitNum1 = secondDigitNum1 == firstDigitNum2 || secondDigitNum1 ==  secondDigitNum2;
           isSharedBoth = compareFirstDigitNum1 || compareSecondDigitNum1;
       }
       return isTrue || isSharedBoth;
    }

    //    Even Digit Sum
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int result = 0;
        while (number > 0) {
            int digit = number % 10; // ambil digit terakhir
            if (digit % 2 == 0) { // cek apakah digit yg terakhir itu genap ga
                result += digit; // kalo iya, lakukan ini
            }
            number /= 10; // kalo engga, skip digit, next iterasi selanjutnya
        }
        return result;
    }

    //    First And Last Digit Sum
    public static int sumFirstAndLastDigit(int num) {
        int count = 0;
        int numTemp = num;
        String stringNum = String.valueOf(Math.abs(num));
        int length = String.valueOf(Math.abs(num)).length();
        String firstString = String.valueOf(stringNum.charAt(0));
        String lastString = String.valueOf(stringNum.charAt(length - 1));


        if (num < 0) {
            return -1;
        } else if (num == 0) {
            return 0;
        }

        while (numTemp > 0) {
            numTemp /= 10;
            count++;
        }

        if (count == 1) {
            return num + num;
        }
        return (Integer.parseInt(firstString) + Integer.parseInt(lastString));
    }

    //    isPalindrome
    public static boolean isPalindrome(int number) {
        int absNumberComparative = Math.abs(number);
        int absNumber = Math.abs(number);
        int reversed = 0;

        while (absNumber > 0) {
            reversed = reversed * 10 + absNumber % 10;
            absNumber /= 10;
        }
        return absNumberComparative == reversed;
    }

    //    For Loop
    public static boolean isOdd(int num) {
        return num >= 0 && num % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if ((start < 0 || end < 0) && (end >= start)) {
            return -1;
        }

        int sumUp = 0;
        for (int a = start; a <= end; a++) {
            if (isOdd(a)) {
                sumUp += a;
            }
        }
        System.out.println(sumUp);
        return sumUp;
    }

    public static boolean isLeapYearBySwitch(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        int caseValue = (year % 400 == 0) ? 1 :
                (year % 100 == 0) ? 2 :
                        (year % 4 == 0) ? 3 : 4;

        return switch (caseValue) {
            case 1 -> true;
            case 2 -> false;
            case 3 -> true;
            case 4 -> false;
            default -> false;
        };
    }

    public static int getDaysInMonthBySwitch(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYearBySwitch(year) ? 29 : 28;
            default -> -1;
        };
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 400 != 0 && year % 100 == 0) {
                return false;
            } else if (year % 4 == 0) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else {
            if (month == 1) {
                return 31;
            } else if (month == 2) {
                if (year % 400 != 0 && year % 100 == 0) {
                    return 28;
                } else if (year % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            } else if (month == 3) {
                return 31;
            } else if (month == 4) {
                return 30;
            } else if (month == 5) {
                return 31;
            } else if (month == 6) {
                return 30;
            } else if (month == 7) {
                return 31;
            } else if (month == 8) {
                return 31;
            } else if (month == 9) {
                return 30;
            } else if (month == 10) {
                return 31;
            } else if (month == 11) {
                return 30;
            } else if (month == 12) {
                return 31;
            }
        }
        return 0;
    }

    //    Number in word
    public static void printNumberInWord(int num) {
        String result = switch (num) {
            case 0 -> {
                yield "ZERO";
            }
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.print(result);
    }

    //    Enhanced Switch Statement
    public static void printDayOfWeek(int day) {
        switch (day) {
            case 1 -> System.out.println(day + " is Sunday");
            case 2 -> System.out.println(day + " is Monday");
            case 3 -> System.out.println(day + " is Tuesday");
            case 4 -> System.out.println(day + " is Wednesday");
            case 5 -> System.out.println(day + " is Thursday");
            case 6 -> System.out.println(day + " is Friday");
            case 7 -> System.out.println(day + " is Saturday");
            default -> System.out.println("The value is invalid");
        }
    }


    //    Minutes to years and days calculator
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        } else if (minutes == 0) {
            System.out.println(minutes + " min = " + minutes + " y and " + minutes + " d");
            return;
        }
        long year = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long day = remainingMinutes / 1440;
        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }

    //    Area Calculator (OVERLOADED METHOD)
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        double total = Math.PI * Math.sqrt(radius);
        return total;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 1) {
            return -1;
        }
        double totalArea = x * y;

        return totalArea;
    }

    //    Seconds and minutes challenge
    public static String getDuration(int seconds) {
        if (seconds <= 0) {
            System.out.println("seconds must be more the zero");
        }
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSecond = seconds % 60;
        System.out.println(hours + "h " + remainingMinutes + "m " + remainingSecond + "s ");

        return hours + "h " + remainingMinutes + "m " + remainingSecond + "s ";
    }

    public static String getDuration(int minutes, int seconds) {
        if (minutes <= 0 || (seconds <= 0 || seconds >= 59)) {
            System.out.println("Error input invalid value");
        }
        int totalSecond = (minutes * 60) + seconds;
        String result = getDuration(totalSecond);
        System.out.println(result);
        return result;
    }

    //    overloaded method challenge
    public static double convertToCentimeters(int height) {
        double converted = height * 2.54;
        System.out.println("converted inch to cm " + converted);
        return converted;
    }

    public static double convertToCentimeters(int foot, int inch) {
        double converted = (foot * 30.48) + convertToCentimeters(inch);
        System.out.println("total converted: " + converted);
        return converted;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int int1 = (int) (num1 * 1000);
        int int2 = (int) (num2 * 1000);
        return int1 == int2;
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    //    EXERCICE
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int moduloByte = kiloBytes % 1024;
        int devidedByte = kiloBytes / 1024;
        System.out.println(kiloBytes + " KB = " + devidedByte + " MB and " + moduloByte + " KB");
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        long convertKmToMiles = Math.round(kilometersPerHour / 1.609);
        return convertKmToMiles;
    }

    public static void printConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);
        if (result < 0) {
            System.out.print("Invalid Value");
            return;
        }
        System.out.print(kilometersPerHour + " km/h = " + result + " mi/h");
    }

    public static void checkNumber (int number) {
        if (number < 0) {
            System.out.println("negative");
        }
        else if (number > 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("zero");
        }
    }
}
 