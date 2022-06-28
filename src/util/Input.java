package util;

import shapes.Circle;

import java.text.NumberFormat;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("what is your name");
        return scanner.nextLine();
    }
    public String getString(String input) {
        System.out.println(input);
        return scanner.nextLine();
    }


    public boolean yesNo() {
        System.out.println("would you like to play a game?");
        String answer = scanner.nextLine();
        if (answer.equals("yes") || answer.equals("yea") || answer.equals("y")) {
            return true;
        } else {
            return yesNo();
        }
    }

    public int getInt() {
//        System.out.println("give me a number");
        String input = getString("give me a number");
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getInt();
        }
    }

    public int getInteger(int min, int max) {
        String input = getString("give me a number between " + min + " and " + max + ".");

        try {
            int Input = Integer.parseInt(input);
            if (Input >= min && Input <= max) {
                return Input;
            } else {
                System.out.println("can;\'t count?");
                return getInteger(min, max);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getInteger(min, max);
        }
    }

    public double getDouble() {

        String input= getString("give me a number");
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        String input = getString("give me a number between " + min + " and " + max + ".");
        try {
            double Input = Double.parseDouble(input);
            if (Input > min && Input < max) {
                return Input;
            } else {
                System.out.println("can;\'t count?");
                return getDouble(min, max);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getDouble();
        }
    }
// got this from walk trough, this was the bonus.
    public long getHex() {
        System.out.println("Input hexadecimal number");
        while (true) {
            try {
                long hex = Long.valueOf(scanner.nextLine(), 16);
                System.out.println("Input acceptable");
                return hex;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Input not a hexadecimal. Try again.");
            }
        }
    }

    public long getBinary() {
        System.out.println("Input binary number");
        while (true) {
            try {
                long bin = Long.valueOf(scanner.nextLine(), 2);
                System.out.println("Input acceptable");
                return bin;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Input not in binary. Try again.");
            }
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

//        public static void main(String[] args) {
//
//            Input answer = new Input();
//            System.out.println(answer.getString());
//
//            System.out.println(answer.yesNo());
//            System.out.println(answer.getInt(1,10));
//
//        }

    }

