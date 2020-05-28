package figur_3x6;

public class Circle extends GeometryFig {
    private int diameter;
    private float area;

    @Override
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void setSquareSide(int i) {

    }

    @Override
    public void setBase(int i) {

    }

    @Override
    public void setHeight(int i) {

    }

    private float countArea() {
        area = (float) (3.14 * diameter);
        return area;
    }

    @Override
    public float getArea() {
        area = countArea();
        return area;
    }
}