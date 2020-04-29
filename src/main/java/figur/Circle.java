package figur;

public class Circle extends GeometryFig {
    private int diameter;
    private float area;

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    private float countArea() {
        area = (float) (3.14 * diameter);
        return area;
    }

    public float getArea() {
        area = countArea();
        return area;
    }
}