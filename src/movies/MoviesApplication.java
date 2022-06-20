package movies;

import com.sun.security.jgss.GSSUtil;
import util.Input;
import movies.MoviesArray;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        Input answer = new Input();
        System.out.printf("What would you like to do?%n%n" + " 0 - exit %n " + "1 - view all movies %n 2 - view movies in the animated category %n 3 - view movies in the drama category %n 4 - view movies in the horror category %n 5 - view movies in the scifi category %n%n");
        System.out.println(MoviesArray.findAll()[1].toString());
        System.out.println("enter your choice: ");
        System.out.println(answer.getInt());
        System.out.println(MoviesArray.findAll()[1]);
        if (answer.getInt() == 1) {
            System.out.println(MoviesArray.findAll()[1]);
        } else if (answer.getInt() == 2) {
            findAll();
        } else if (answer.getInt() == 3) {
            findAll();
        }
    }
}