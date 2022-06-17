package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
//        boolean keepmakingcircles = true;
//        while (keepmakingcircles){
        Input in= new Input();
        System.out.println("make a circle");
        Circle circle = new Circle(in.getDouble());
        System.out.println("this is a circle.");
        System.out.printf("circle has a circumference of %f?%n", circle.getCircumference());
        System.out.printf("circle area is %f?%n", circle.getArea());

    }
//        System.out.println("do you want to do another circle?");
//        keepmakingcircles= in.yesNo();
}
