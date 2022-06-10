import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

        String Name = "dog";
        System.out.println("Hello, World!");
        System.out.println("hello, Jeff!");
        System.out.println("hello, bob");
        System.out.printf("hello, %s!%n",Name );    // %n makes it skip a line

        byte tinyNum = 127;
        tinyNum++;
        System.out.println(tinyNum);

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
//        String myString= 3.14159;
//        System.out.println(myString);
        float myNumber = (float)3.14; // or add F on the end
        System.out.println(myNumber);
        long Num = (int)3.14;
        System.out.println(Num);
        String Mystring = "pet";
        System.out.println(Mystring);
        Mystring= "peta";
        System.out.println(Mystring);

//        int x = 5;
//        System.out.println(x++); /// ++ is adding a digit after it logs it
//        System.out.println(x);



//        int x = 5;
//        System.out.println(++x); /// ++ is adding a number before t is logged
//        System.out.println(x);

//        var class = "dog";  //// class is a reserved word;

        String theNumberThree = "three";
        System.out.println(theNumberThree);
        Object o = theNumberThree;
        System.out.println(o);
//        int three = (int) o;
//        System.out.println(three);


//        int three = (int) "three";       /////it is not a  number
//
//        int x = 4;
////        x = x + 5;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
////        x = x / y;
//        x /= y;
////        y = y - x;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);

        byte NumberMax = Byte.MIN_VALUE;
        System.out.println(NumberMax);



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}

//    public static void main(String[] args) { // psv
//        System.out.println();  //sout
//        System.out.printf(""); //souf








