package figur_3x6;

public class Square extends GeometryFig {
    private int squareSide;
    private int area;

    public void setSquareSide(int squareSide) {
        this.squareSide = squareSide;
    }

    private int countArea() {
        area = squareSide * squareSide;
        return area;
    }

    public int getArea() {
        area = countArea();
        return area;
    }
}
