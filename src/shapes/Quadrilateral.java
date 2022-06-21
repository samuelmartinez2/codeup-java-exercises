package shapes;

public class Quadrilateral extends Shape implements Measurable{

    protected int length;
    protected int width;

    public void Measurements(int num1, int num2) {
        this.length = num1;
        this.width = num2;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
