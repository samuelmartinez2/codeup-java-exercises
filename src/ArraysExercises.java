import java.util.Arrays;

public class ArraysExercises {
    static Person[] users;

    //method to add person and return an increased array size
    public static Person[] addPerson (Person[] arr, Person user) {
        Person[] NewArr = new Person[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {  //arr size 3, newarr size 4
            NewArr[i] = arr[i];
            // i = 0,    bob to new arr 0
            // i = 1   john to new arr 1
            // i = 2 joe to new arr2
            // arr.length = 3, so stops at index 2
            // newarr lenght = 4, so need to set a value in index 3
            //INDEX is always one less than array length, because index starts at 0 not 1



        }
        NewArr[NewArr.length-1] = user;
//        for(String i: NewArr){
//            System.out.println(i);
//        }

        return NewArr;


    }

    //MAIN method
    public static void main(String[] args) {
        users = new Person[3];
        users[0] = new Person("Bob");
        users[1] = new Person("pepe");
        users[2] = new Person("jose", 23);
        for (int i = 0; i< users.length; i++) {
            System.out.println(users[i].getName());
            System.out.println(users[i].getAge());

        }
 Person[] newArr= addPerson(users,new Person("sam"));


//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

//        String[] people= {"bob", "john", "joe"};
//
//        String newPerson = "steve";
//        String newPerson2 = "juan";

//String[] People2 = new String[people.length +2];
//        for (int i = 0; i < people.length; i++) {
//            People2[i] = people[i];
//            System.out.println(People2[i]);
//        }

//        for (String newpeople: people) {
//            System.out.println(newpeople);
//        }
//        People2[3]= newPerson;
//        People2[4]= newPerson2;

//        System.out.println(Arrays.toString(people));
//        System.out.println(Arrays.toString(People2));
//        people = addPerson(people, newPerson2);

//        for(int i = 0; i < people.length; i++){
//            System.out.println(people[i]);
//        }

//        System.out.println(people[people.length - 1]);
    }





    //*************************
//    end of class
}
