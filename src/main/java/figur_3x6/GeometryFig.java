package figur_3x6;

public abstract class GeometryFig {
    private String name; // Имя фигуры
    private int x; // Координата x центра
    private int y; // Координата y центра

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract float getArea();

//    public abstract void setDiameter(int i);

//    public abstract void setSquareSide(int i);

//    public abstract void setBase(int i);

//    public abstract void setHeight(int i);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
