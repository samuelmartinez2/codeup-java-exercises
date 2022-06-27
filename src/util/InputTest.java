package util;

public class InputTest {
    public static void main(String[] args) {

        Input answer = new Input();
        System.out.println(answer.getString());

        System.out.println(answer.yesNo());
        System.out.println(answer.getInt(1,10));

    }
}
