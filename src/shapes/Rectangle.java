package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle() {
    }

    public Rectangle(int num1, int num2) {
        this.length = num1;
        this.width = num2;
    }
    public int getArea() {
        return length * width;
    }
    public int getPerimeter() {
        return 2*length + 2* width;
    }




    //////end of class/////////
}
