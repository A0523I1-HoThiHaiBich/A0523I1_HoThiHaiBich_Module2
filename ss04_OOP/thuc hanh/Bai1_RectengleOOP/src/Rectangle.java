public class Rectangle {
    double width, height;
    public Rectangle(){

    }
    public Rectangle( double width, double height){
        this.width= width;
        this.height=height;

    }
    public  double getArea(double witdh, double height){
        double area= this.width*this.height;
        return area;
    }
    public  double getPremeter(double width, double height){
        double premeter=(this.width+this.height)*2;
        return premeter;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
