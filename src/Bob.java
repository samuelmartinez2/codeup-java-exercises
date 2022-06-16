import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("what is your question");
        String Answer = scan.nextLine();
        if (Answer.endsWith("?")) {
            System.out.println("Sure");
        }else if (Answer.endsWith("!")) {
            System.out.println("Whoa, chill out");
        } else if (Answer.isEmpty()) {
            System.out.println("Fine be that way");
        }else {
            System.out.println("Whatever");
        }



    }
}


//
//    String message = "how are you doing?";
//        System.out.print(message);
////        String Bobanswer = scanner.next();
//        message.endsWith(?) {
//            System.out.println("Sure");
//        }
////        System.out.println(Bobanswer);
//
//
//
//        //        System.out.print("Enter an integer: ");
////        int userInput = scanner.nextInt();
////        System.out.println(userInput);
//    }
//}
