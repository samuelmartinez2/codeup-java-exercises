package shapes;

public class Square extends Rectangle {

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }


    public int getArea() {
        return side^ 2;
    }
    public int getPerimeter() {
        return 4 * side;
    }



}

