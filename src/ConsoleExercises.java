import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.4s.%n", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        scanner.nextLine();

//        System.out.print("enter 3 separate words");
//        String UserInput1 = scanner.next();
//        String UserInput2 = scanner.next();
//        String UserInput3 = scanner.next();
//
//        System.out.println(UserInput1);
//        System.out.println(UserInput2);
//        System.out.println(UserInput3);
//        System.out.println("you said; %s %s %s", UserInput1, UserInput2,UserInput3);
//
//        scanner.nextLine();
//        System.out.print("can you type a short a sentence");
////        String UserSentence = scanner.next();
//        String UserSentence2 = scanner.nextLine();
////        System.out.println(UserSentence);
//        System.out.println(UserSentence2);

//        System.out.print("enter the width of the classroom");
//        String Width = scanner.nextLine();
//        System.out.print("enter the length of the classroom");
//        String Length = scanner.nextLine();
//        int length = Integer.parseInt(Length);
//        int width = Integer.parseInt(Width);
//
//
//        System.out.println(length);
//        System.out.println(width);
//        System.out.printf("the ares of the classroom is %s square feet,%n", length * width);
//        System.out.printf("the ares of the classroom is %s square feet,%n", (length*2) + (width*2));

        System.out.print("enter the width of the classroom");
        String Width = scanner.next();
        System.out.print("enter the length of the classroom");
        String Length = scanner.next();
        System.out.print("enter the height of the classroom");
        String Height = scanner.next();
        float length = Float.parseFloat(Length);
        float width = Float.parseFloat(Width);
        float height = Float.parseFloat(Height);


        System.out.println(length);
        System.out.println(width);
        System.out.println(height);
        System.out.printf("the ares of the classroom is %s square feet,%n", length * width);
        System.out.printf("the ares of the classroom is %s square feet,%n", (length*2) + (width*2));
        System.out.printf("the Volume of the classroom room is %s feet,%n", length * width * height);

//        scanner.useDelimiter("\n");

    }
}
//    public static void main(String[] args) { // psv
//        System.out.println();  //sout
//        System.out.printf(""); //souf