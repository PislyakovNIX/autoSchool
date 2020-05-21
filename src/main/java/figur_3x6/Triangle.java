package figur_3x6;

public class Triangle extends GeometryFig {
    private int base;
    private int height;
    private float area;

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private float countArea() {
        area = (float) (0.5 * base * height);
        return area;
    }

    public float getArea() {
        area = countArea();
        return area;
    }
}
