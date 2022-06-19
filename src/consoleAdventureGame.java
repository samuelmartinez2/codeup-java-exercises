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
        String mission ="<<<<<<<<<<You are stuck on a castle and need to fight your way out. Some of the enemies will be tough but you only have 3 choices. attack, run or cry. you will start with 100  health point. If you loose all your health, you have failed. If you get to 200 health points, you will be able to open a portal and leave the castle>>>>>>>>>>";
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        if (userName.isEmpty()) {
            wanttoplay();
        } else {
            System.out.println("From now on, you will be known as <<<" + userName.toUpperCase() + " THE GREAT>>>. Would you like to play a game ? .... Yes or No");
            String userchoice = scan.nextLine();
            if (userchoice.equalsIgnoreCase("no")) {
                System.out.println(" Are you scared? is that what it is? from now on you will be known as " + userName + " the weak warrior who ran away from a fight. However; you are stuck and you are still going to play, lets hope you survive. "+ mission);
            } else if (userchoice.equalsIgnoreCase("yes")) {
                System.out.println("Great, lets play"+ mission);
            }
        }
    }

    public static void Game() {
        int Sword = 40;
        int shield = 20;
        int armor = 15;
        int horse = 40;
        int car = 40;
        int magic = -20;
        int robber = -10;
        int karen = -30;
        int rain = -10;
        int Smith = -80;
        Scanner scan = new Scanner(System.in);
//        int items = items();
        boolean decision = true;
        int health = 100;
        System.out.println(health);
        int randomN = (int) (Math.random() * 10) + 1;
        int hit = health + randomN;
        int damage = (int) (Math.random() * 10) + 1;
        int attack = (int) (Math.random() * 3) + 1;
        int mystery = -10 + (int) (Math.random() * 10) + 1;
        int run = -5 + (int) (Math.random() * 5) + 1;

        wanttoplay();

        while (decision) {
            {
                if (health <= 0) {
                    System.out.println(" You have bleed out, better luck next time");
                    break;
                } else if (health >= 200) {
                    System.out.println("I knew you where a real warrior, great job, you have prevailed, you have opened a portal and can go where ever you wish");
                } else {
                    System.out.println("What would you like to do? choose one: attack, cry, run");
                }

                switch (scan.next().toLowerCase()) {
                    case "attack": {
                        System.out.println("You decided to attack,");
//                                "you have caused " + damage + " damage to your enemy. you will gain their damage. " + (health +" is your new health,"));
                        damage = (int) (Math.random() * 10) + 1;
//                        health = health + damage;
                        if (damage == 1) {
                            health += Sword;
                            System.out.println("you found a sword to slay your enemy, you have gained " + Sword + " health point. you now have<< " +health+ " >>health points");
                        } else if (damage == 2) {
                            health += shield;
                            System.out.println("you found a shield to protect your from your enemy, you have gained " + shield + " health point. you now have<< " +health+ " >>health points");
                        } else if (damage == 3) {
                            health += armor;
                            System.out.println("you found some armor to slay your enemy, you have gained " + armor + " health point. you now have<< " +health+ " >>health points");
                        } else if (damage == 4) {
                            health += horse;
                            System.out.println("you have used horse to slay your enemy, you have gained " + horse + " health point. you now have<< " +health+ " >>health points");
                        } else if (damage == 5) {
                            health += car;
                            System.out.println("you found a car to slay your enemy, you have gained " + car + " health point. you now have<< " +health+ " >>health points");
                        }else if (damage == 6) {
                            health += magic;
                            System.out.println("your enemy has used some magic for protection, you have lost " + magic + " health point. you now have<< " +health+ " >>health points");
                        }else if (damage == 7) {
                            health += robber;
                            System.out.println("you found out a thief stole your shield, you have lost " + robber + " health point. you now have<< " +health+ " >>health points");
                        }else if (damage == 8) {
                            health += karen;
                            System.out.println("you ran in to a karen while slaying your enemy, you have lost " + karen + " health point. you now have<< " +health+ " >>health points");
                        }else if (damage == 9) {
                            health += rain;
                            System.out.println("it started raining and your armored gor rusty, its really hard to move, you have lost<< " + rain + " >>health point. you now have " +health+ " health points");
                        }else {
                            health += Smith;
                            System.out.println("you have been slapped by mr Smith, no words where exchanged and you have lost<< " + Smith + " >>health point. you now have " +health+ " health points");
                        }
                    }
                    System.out.println(health);
                    break;
                    case "cry": {
                        System.out.println("you decided to cry, your enemy will decide your future");
//                        System.out.println(health);
                        mystery = -20 + (int) (Math.random() * 20) + 1;
                        health += mystery;
                        if (mystery >= 0) {

                            System.out.println("you have been spared, your enemy felt bad for you and let you leave, your luck has gain you" + mystery + "health points." + health + " is your new health");

                        } else {
                            System.out.println(health + " is your current health");
//                            mystery = -10 + (int) (Math.random() * 10) + 1;
//                            health += mystery;
                            System.out.println("you have been left at the mercy of your enemy and have lost " + mystery + " health points because of your choice. " + health + " is your new health");
                        }
                    }
                    System.out.println(health);
                    break;
                    case "run": {
                        System.out.println("you decided to run, lets hope you are fast enough ");
                        run = -20 + (int) (Math.random() * 30) + 1;
                        health += run;
//                        System.out.println(run);
                        if (run >= 0) {
                            System.out.println(health + " is your current health");
                            System.out.println("your enemy is to slow for you, your speed has gained you " + run + " health points.  " + health + " is your new health");
                        } else {
//                            System.out.println(health+ " is your current health");
//                            run = -5 + (int) (Math.random() * 5) + 1;
//                            System.out.println(run);
//                            health += run;
                            System.out.println(" you are to slow, you have lost" + run + " health points. " + (health) + " is your new health");
                        }
                    }
                    System.out.println(health);
                }
            }
        }

    }



    public static void main(String[] args){


Game();
    }
}