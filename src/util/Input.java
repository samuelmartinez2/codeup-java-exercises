package util;

import shapes.Circle;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("what is your name");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("would you like to play a game?");
        String answer = scanner.nextLine();
        if (answer.equals("yes") || answer.equals("yea")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
//        System.out.println("give me a number");
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        System.out.printf("give me a number from %d - %d", min, max);
        int userinput = scanner.nextInt();
        if (userinput >= min && userinput <= max) {
            return userinput;
        } else {
            System.out.println("can;\'t count");
            return getInt(min, max);
        }
    }


    public double getDouble() {
        System.out.println("give me a number");
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.printf("give me a number from %f - $f", min, max);
        double userinput = scanner.nextDouble();
        if (userinput > min && userinput < max) {
            return userinput;
        } else {
            System.out.println("can;\'t count");
            return getDouble(min, max);
        }
    }



//
//    public int getInt(int min, int max) {
//    Scanner scanner = new Scanner(System.in);
//    boolean parameter = true;
//    while (parameter) {
//        System.out.println("could you pick a number from" + min + "-" + max);
//        int answer = scanner.nextInt();{
//            if(answer >= 10 || answer <= 1) {
//                parameter = false;
//            }
//            else if (answer <= 10 || answer >= 1) {
//                System.out.println("good job, you can count");
//            } break;
//        }
//    }return (getInt(min, max));
//}
//
//
//public double getDouble(double min, double max) {
//    return scanner.nextDouble();
//}
//public double getDouble(){
//    return scanner.nextDouble();
//    }
//

        public static void main(String[] args) {

            Input answer = new Input();
            System.out.println(answer.getString());

            System.out.println(answer.yesNo());
            System.out.println(answer.getInt(1,10));

        }

    }

