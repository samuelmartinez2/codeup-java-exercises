public class Person {

    private String name;
    private int age;

    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public  String sayHello() {
        return String.format("Hello, My name is %s.", this.name);
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Person bob = new Person("bob");
        System.out.println(bob.sayHello());
//        System.out.println(bob.name);
//        System.out.println(bob.getName());
//        bob.setName("bob the builder");
//        System.out.println(bob.getName());
//        Person carl = new Person("carl",25);
//        System.out.println(carl.sayHello());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("john");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName(("Jane"));
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }
}
