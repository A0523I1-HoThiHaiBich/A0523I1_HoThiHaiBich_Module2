import org.w3c.dom.ls.LSOutput;

public class Fan {
    private int speed = 1;
    private final int LOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public int getLOW() {
        return LOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String message = "";
        if (this.isOn()) {
            message += " Fan is on"+ "\n";
        } else {
            message += ("Fan is off"+ "\n");
        }
        message += "Speed: " + this.speed + "\n";
        message += "Radius: " + this.radius + "\n";
        message += " Color: " + this.color;
        return message;
    }
}
