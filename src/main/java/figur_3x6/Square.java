package figur_3x6;

public class Square extends GeometryFig {
    private int squareSide;
    private float area;

    public void setSquareSide(int squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public float getArea() {
        area = squareSide * squareSide;
        return area;
    }
}
