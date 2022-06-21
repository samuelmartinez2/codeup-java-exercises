package shapes;


public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }
    public Square(int width, int length) {
        super(length, width);
    }

    @Override
    public int getPerimeter() {
        return 4*length;
    }

    @Override
    public int getArea() {
        return length*length;
    }



    @Override
    public void setLength(int length) {
        this.length= length;
        width= length;
    }

    @Override
    public void setWidth(int width) {
        this.width= width;
        length= width;
    }

//
//    protected int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//
//    public int getArea() {
//        System.out.println("square");
//        return side^ 2;
//    }
//    public int getPerimeter() {
//        System.out.println("square");
//        return 4 * side;
//    }
//




}


