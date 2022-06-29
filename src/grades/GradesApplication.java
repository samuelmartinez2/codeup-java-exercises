package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student Joe = new Student("Joe");
        Joe.addGrade(80);
        Joe.addGrade(90);
        Joe.addGrade(95);

        Student Bob = new Student("Bob");
        Bob.addGrade(98);
        Bob.addGrade(85);
        Bob.addGrade(80);

        Student Maria = new Student("Maria");
        Maria.addGrade(99);
        Maria.addGrade(95);
        Maria.addGrade(90);

        students.put("BobGit", Bob);
        students.put("GitJoe",Joe);
        students.put("GitMaria",Maria);

        boolean choice = true;

        while (choice) {
            System.out.printf("What student would you like to see?\n");
            students.forEach((ID, student) -> System.out.println(".. "+ ID +" .." ));
            Scanner userInput = new Scanner(System.in);
            String answer = userInput.nextLine();

            if (students.containsKey(answer)) {
                Student Search = students.get(answer);
                System.out.printf("Name-( %s )- GitHub Username- %s  Current Average is- ((%f))", Search.getName(), answer, Search.getGradeAverage());
            }else {
                System.out.format("no student found with username (( %s))",answer);
            }

            System.out.println("\nWould you like to try again? Y/N");
            answer = userInput.nextLine();

            if(answer.equalsIgnoreCase("n")) {
                choice = false;
            }
        }



    }
}
