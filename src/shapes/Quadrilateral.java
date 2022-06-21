package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    //    protected int side;
    protected int length;
    protected int width;


    public Quadrilateral(int length, int width) {
//    public void Measurements(int num1, int num2, int side) {
        this.length = length;
        this.width = width;
////        this.side = side;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

//    public int getSide() {
//        return side;
//    }

    public abstract void setLength(int length);

    public abstract void setWidth(int width);


}
//
//    @Override
//    public int getPerimeter() {
//        return 2*length + 2*width ;
//    }
//
//    @Override
//    public int getArea() {
//        return length*width;
//    }
//}
