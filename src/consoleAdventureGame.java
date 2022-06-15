import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class consoleAdventureGame {


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

    public static void wanttoplay() {
        Scanner scan = new Scanner(System.in);
//        boolean answer = true;
        System.out.println("what is your name warrior?");
        String userName = scan.nextLine();
        if (userName.isEmpty()) {
            wanttoplay();
        } else {
            System.out.println("would you like to play a game >>" + userName.toUpperCase() + " THE GREAT<< ?");
            String userchoice = scan.nextLine();
            if (userchoice.equalsIgnoreCase("no")) {
                System.out.println(" Are you scared? is that what it is? from now on you will be known as " + userName + " the weak warrior who ran away from a fight");
            } else if (userchoice.equalsIgnoreCase("yes")) {
                System.out.println("Great, lets play");
            }
//            else wanttoplay();

        }
    }

    public static void items() {
        int Sword = 20;
        int shield = 10;
        int armor = 10;
        int horse = 30;
        int car = 40;
        int ghost = -10;
        int robber = -10;
        int karen = -20;
        int rain = -10;
        int Smith = -100;

    }

    public static void randoNum() {

    }


    public static void Game() {

        Scanner scan = new Scanner(System.in);
//        int items = items();
        boolean decision = true;
        int health = 100;
        System.out.println(health);
        int randomN = (int) (Math.random() * 10) + 1;
        int hit = health + randomN;
        int damage = randomN;
        int attack = (int) (Math.random() * 3) + 1;
        int mystery = -10 + (int) (Math.random() * 10) + 1;
        int run = -5 + (int) (Math.random() * 5) + 1;

                wanttoplay();

        while (decision) {

            {

                if (health == 0) {
                    System.out.println(" you have bleed out, better luck next time");
                    break;
                } else {
                    System.out.println("what would you like to do? choose one: attack, cry, run");
                }
                switch (scan.next().toLowerCase()) {
                    case "attack": {
                        System.out.printf("damaged cause%d new health%d", damage, (health + damage));
//                        System.out.println("you decided to attack, you have caused " + damage + " damage to your enemy. " + (health + damage) + " is your new health,");
                    }
                    System.out.println(health);
                    break;
                    case "cry": {
                        System.out.println("you decided to cry, your enemy will decide your future");
                        if (mystery >= 0) {
                            System.out.println("you have been spared, your enemy felt bad for you and let you leave, your luck has gain you" + mystery + "health points." + (health + mystery) + " is your new health");
                        } else {
                            System.out.println("you have been left at the mercy of your enemy and have lost " + mystery + " health points because of your choice. " + (health + mystery) + " is your new health");
                        }
                    }
                    break;
                    case "run": {
                        System.out.println("you decided to run, lets hope you are fast enough ");
                        if (run >= 0) {
                            System.out.println("your enemy is to slow for you, your speed has gained you " + run + " health points.  " + (health + run) + " is your new health");
                        } else {
                            System.out.println(" you are to slow, you have lost" + run + " health points. " + (health + run) + " is your new health");
                        }
                    }
                }
            }
        }

    }



    public static void main(String[] args){
//Scanner scan= new Scanner(System.in);
//        System.out.println(addition(1,2));

//wanttoplay();
Game();
    }
}