package figur_3x6;

public class Square extends GeometryFig {
    private int squareSide;
    private float area;

    @Override
    public void setSquareSide(int squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public void setBase(int i) {

    }

    @Override
    public void setHeight(int i) {

    }

    private float countArea() {
        area = squareSide * squareSide;
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
}
