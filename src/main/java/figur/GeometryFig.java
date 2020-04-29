package figur;

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
