package util;

public class InputTest {
    public static void main(String[] args) {
//        try{
//            Double.parseDouble(getString()) = getDouble();
//            System.out.println("ok"+ Double.valueOf(getString()));
//        } catch (Exception e) {
//            System.out.println(" HERE "+ e. getMessage());
//            System.out.println("more details");
//            e.printStackTrace();
//        }


        Input answer = new Input();


//        System.out.println(answer.getString());
//
//        System.out.println(answer.yesNo());
        System.out.println(answer.getInt());
        System.out.println(answer.getInteger(5,20));
        System.out.println(answer.getDouble());
        System.out.println(answer.getDouble(5,10));


    }
}
