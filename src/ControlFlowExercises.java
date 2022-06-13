import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        int i = 5;
//        while (i <= 15){
//            System.out.print(" "+i);
//            i++;
//        }



//        int x = 0;
//        do {
//            System.out.println(x);
//            x+=2;
//        }while (x < 100);



//        int x = 100;
//        do {
//            System.out.println(x);
//            x-=5;
//        }while (x >= -10);


//        long x = 2;
//        do {
//            System.out.println(x);
//            x*=x;
//        }while (x < 1000000);


//        for ( int i = 5; i <= 15; i++ ) {
//            System.out.print(" "+ i);
//        }

//        for (int i = 0; i <= 100; i+=2){
////            if (i % 2 == 1) {
////                continue;
////            }
//            System.out.println(i);
//        }

//        for (int i = 100; i>= -10; i -= 5){
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i*=i ) {
//
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i++) {
//            if(i % 15 == 0) {
//                System.out.println( i + " FizzBuzz ");
//            } else if(i % 3 == 0) {
//                System.out.println(i +" Fizz ");
//            } else if(i % 5 == 0) {
//                System.out.println(i +" Buzz ");
//            } else {
//                System.out.println(i);
//        }
//

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter an integer: ");
//        int uN = scanner.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println(("number | squared | cubed"));
//        System.out.println("------ | ------- | -----");
//
//
////        System.out.printf(" %s     |"+square +"        |" +cubed , uN);
//        for (int i=1; i<= uN; i++){
//            int square = i*i;
//            int cubed = i*square;
//            System.out.printf(" %s     |"+square +"        |" +cubed+"%n" , i);
//        }
//
//        System.out.println("do you want to continue?");
//        if (scanner.next().equalsIgnoreCase("yes")) {
//            System.out.println("Ok then, enter an integer: ");
//            int uN2 = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println(("number | squared | cubed"));
//            System.out.println("------ | ------- | -----");
//
////        System.out.printf(" %s     |"+square +"        |" +cubed , uN);
//            for (int i = 1; i <= uN2; i++) {
//                int square = i * i;
//                int cubed = i * square;
//                System.out.printf(" %s     |" + square + "        |" + cubed + "%n", i);
//            }
//        } else {
//                System.out.print("OK, fine ");
//            }

        System.out.println("Enter an integer: ");


        boolean ans = true;

        while (ans) {
            System.out.println("please enter your grade");
            int grade = scanner.nextInt();
            if (grade > 0 && grade <= 59) {
                System.out.println("F");
            } else if (grade >59 && grade <=66) {
                System.out.println("D");
            } else if (grade > 66 && grade <= 79) {
                System.out.println("C");
            }else if (grade > 79 && grade <= 87) {
                System.out.println("B");
            }else if (grade > 87 && grade <= 100) {
                System.out.println("A");
            }
            System.out.println("do you want to try it again?");
            String nextChoice = scanner.next();
            if (nextChoice.equalsIgnoreCase("n")) {
                ans = false;
            }
        }
//        int uN3 = scanner.nextInt();
//                switch (scanner.nextInt()) {
//            case if (89 | 90 | 91 | 92 == true); -> System.out.println("Hooray, more vapor wave and jazz.");
//        }


    }
}
