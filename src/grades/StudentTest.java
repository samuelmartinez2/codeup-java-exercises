package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
//        String[] arrOfStudents = {"joe", "bob", "billy", "nancy", "maria"};
//        ArrayList<String> Students = new ArrayList<>(Arrays.asList(arrOfStudents));
//        System.out.println(Students);
        ArrayList<Student> stu = new ArrayList<>();
        ArrayList<Integer> joel = new ArrayList<>();
        joel.add(88);
        joel.add(90);
        stu.add(new Student("Joel", joel));
        stu.add(new Student("billy", 88));
        stu.add(new Student("susan", 95));
        stu.add(new Student("maria", 82));

        for (Student stud : stu) {
            System.out.println(stud.getName());
            System.out.println(stud.getGrades());


        }

    }
}
