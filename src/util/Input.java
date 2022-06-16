package util;

import java.util.Scanner;

public class Input {

Scanner scanner = new Scanner(System.in);

public String getString() {
    System.out.println("what is your name");
    return scanner.nextLine();
}

public boolean yesNo() {
    System.out.println("would you like to play a game?");
    String answer = scanner.nextLine();
    if (answer.equals("yes")) {
        return true;
    } else if(answer.equals("yea")){
        return true;
    } else if (answer.equals("y")){
        return true;
    }else {
        return false;
    }
}

public int getInt(int min, int max) {
    return scanner.nextInt();
}

public double getDouble(double min, double max) {
    return scanner.nextDouble();
}
public double getDouble(){
    return scanner.nextDouble();
    }


        public static void main(String[] args) {

            Input answer = new Input();
            System.out.println(answer.getString());

            System.out.println(answer.yesNo());
        }

    }

