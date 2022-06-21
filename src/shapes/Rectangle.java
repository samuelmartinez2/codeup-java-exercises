package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

//
//    public Rectangle() {
//        setLength();
//        setWidth();
//    }

//    @Override
//    public void setSide() {
//
//    }



//}


//    protected int length;
//    protected int width;
//
//    public Rectangle() {
//    }
//
//    public Rectangle(int num1, int num2) {
//        this.length = num1;
//        this.width = num2;
//    }
//    public int getArea() {
//        System.out.println("rectangle");
//        return length * width;
//    }
//    public int getPerimeter() {
//        System.out.println("rectangle");
//        return 2*length + 2* width;
//    }
//
//
//
//
    //////end of class/////////
}
