package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer>grades;


    public Student ( String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void addGrade( Integer grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double ave = 0;
        for (Integer grade : grades){
            ave = ave+grade;
        }
        return ave/grades.size();
    }

}
