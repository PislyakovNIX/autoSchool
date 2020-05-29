package figur_3x6;

public class Circle extends GeometryFig {
    private int diameter;
    private float area;

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public float getArea() {
        area = (float) (3.14 * diameter);
        return area;
    }
}