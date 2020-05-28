package figur_3x6;

public class Triangle extends GeometryFig {
    private int base;
    private int height;
    private float area;

    @Override
    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    private float countArea() {
        area = (float) (0.5 * base * height);
        return area;
    }

    @Override
    public float getArea() {
        area = countArea();
        return area;
    }

    @Override
    public void setDiameter(int i) {

    }

    @Override
    public void setSquareSide(int i) {

    }
}
