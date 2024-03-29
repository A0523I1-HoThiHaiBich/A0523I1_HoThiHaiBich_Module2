public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
     public double getDiscriminant(double a , double b, double c){
        double delta=b*b-4*a*c;
        return delta;
     }
     public  double getRoot1(double a, double b, double c){
         double delta=b*b-4*a*c;
        double r1= (-b+ Math.pow(delta, 0.5))/(2*a);
        return r1;
     }
    public  double getRoot2(double a, double b, double c){
        double delta=b*b-4*a*c;
        double r2= (-b- Math.pow(delta, 0.5))/(2*a);
        return r2;
    }
}
