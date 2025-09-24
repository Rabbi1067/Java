package seu.bd.edu.labfinal;

public class AreaModel {
    private double height;
    private double width;

    public AreaModel(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return height * width;
    }
}
