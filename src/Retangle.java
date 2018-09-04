public class Retangle extends Shape {
    private double width;
    private double height;

    public Retangle() {
        width = 1;
        height = 1;
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Retangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "A retangle with width= "+ getWidth() + "height= "+ getHeight()
                +" is subclass of: "+ super.toString();
    }
}
