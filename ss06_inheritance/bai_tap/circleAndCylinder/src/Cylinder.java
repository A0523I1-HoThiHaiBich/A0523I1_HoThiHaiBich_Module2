public class Cylinder extends Circle{
    private double heigh=5.0;
    public Cylinder(){

    }

    public Cylinder(double heigh) {
        this.heigh = heigh;
    }

    public Cylinder(double radius, String color, double heigh) {
        super(radius, color);
        this.heigh = heigh;
    }

    public double getHeigh() {
        return heigh;
    }
        public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    public double getVolume(){
        return getArea()*heigh;
    }

    @Override
    public String toString() {
        return "Cylinder- a subclass of circle" +super.toString()+
                " and heigh=" + getHeigh() + " has volume = " +getVolume();
    }
}
