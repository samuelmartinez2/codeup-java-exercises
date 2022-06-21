package movies;

import com.sun.security.jgss.GSSUtil;
import util.Input;
import movies.MoviesArray;

import java.util.Arrays;
import java.util.Scanner;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        Input answer = new Input();
        Movie[] movies = findAll();
        Scanner scan =new Scanner(System.in);
        while (true) {
            System.out.printf("What would you like to do?%n%n" + " 0 - exit %n " + "1 - view all movies %n 2 - view movies in the animated category %n 3 - view movies in the drama category %n 4 - view movies in the horror category %n 5 - view movies in the scifi category %n%n");
            int pick = scan.nextInt();
            if (pick == 1) {
                for (Movie choice : movies) {
                    System.out.println(choice);
                }
            }
            if (pick == 2) {
                for (Movie choice : movies) {
                    if (choice.GetCategory().equalsIgnoreCase("animated")) System.out.println(choice);
                }
            }
            if (pick == 3) {
                for (Movie choice : movies) {
                    if (choice.GetCategory().equalsIgnoreCase("drama")) System.out.println(choice);
                }

            }
            if (pick == 4) {
                for (Movie choice : movies) {
                    if (choice.GetCategory().equalsIgnoreCase("horror")) System.out.println(choice);
                }
            }
            if (pick == 5) {
                for (Movie choice : movies) {
                    if (choice.GetCategory().equalsIgnoreCase("scifi")) System.out.println(choice);
                }
            }
            if (pick == 0) {
                System.out.println("got it");
                break;
            }
        }

//        System.out.println(MoviesArray.findAll()[1].toString());
//        System.out.println("enter your choice: ");
//        System.out.println(answer.getInt());
//        System.out.println(MoviesArray.findAll()[1]);
//        if (answer.getInt() == 1) {
//            System.out.println(MoviesArray.findAll()[1]);
//        } else if (answer.getInt() == 2) {
//            findAll();
//        } else if (answer.getInt() == 3) {
//            findAll();
//        }
    }
}