public class Rectangle extends Shape{
    private double width =1.0;
    private double heigh= 1.0;
    public Rectangle(){

    }
    public Rectangle(double width, double heigh) {
        this.width = width;
        this.heigh = heigh;
    }

    public Rectangle(String color, boolean filled, double width, double heigh) {
        super(color, filled);
        this.width = width;
        this.heigh = heigh;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + getWidth()+
                "and heigh=" + getHeigh() + ", which is a subclass of " +super.toString();
    }
}
