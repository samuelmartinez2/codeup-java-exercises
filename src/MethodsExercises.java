import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int substraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double Division(double num1, double num2) {
        return num1 / num2;
    }

    public static int Modul(int num1, int num2) {

        return (num1 % num2);
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number from 1-10");
        int input = scan.nextInt();
        if (input >= min && input <= max) {
            return input;
        } else {
            return getInteger(min, max);
        }
    }

    public static int factorial(int min, int max) {
        String willcontinue;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Gime me a number from 1-33");
            int input = scan.nextInt();
            long fact = 1;
            if (input >= min && input <= max) {
                for (int i = 1; i <= input; i++) {
                    String s = String.valueOf(i);
                    System.out.println(i + "! =" + " 1 X " + s + " X  =" + fact * i);
                    fact = fact * i;
                }
                System.out.println(fact);
            } else {
                System.out.println(factorial(min, max));
            }
            System.out.println("want to continue");
            willcontinue = scan.next();
        } while (willcontinue.equalsIgnoreCase("yes"));
        return factorial(min, max);
    }
//public static int diceroll(int min, int max) {
//    Scanner scan = new Scanner(System.in);
//    System.out.println("enter number of sides for a pair of dice");
//    int range = scan.nextInt();
//    {
//        return (int) (Math.random() * range);
//    }
//}

    public static void diceRoll() {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many sides");
        int side = scan.nextInt();
        int first = (int) (Math.random() * side) + 1;
        int second = (int) (Math.random() * side) + 1;

        System.out.printf("%d is first roll.\n%d is second roll.",first ,second);
    }


    public static void main(String[] args){

//        System.out.println(addition(2,3));
//        System.out.println(substraction(2,3));
//        System.out.println(Multiplication(2,3));
//        System.out.println(Division(10,3));
//        System.out.println(Modul(5,1));

//        System.out.println((getInteger(1,10)));

//        System.out.println(factorial(1,33));

 diceRoll();


//        Scanner scan = new Scanner(System.in);
//        int num1,num2,sum=0;
//        System.out.println("first number");
//        num1= scan.nextInt();
//        System.out.println("second number");
//        num2= scan.nextInt();
//        for (int i=1; i<=num1; i++) {
//            sum = sum+num2;
//        }
//        System.out.println(sum);



    }
}
