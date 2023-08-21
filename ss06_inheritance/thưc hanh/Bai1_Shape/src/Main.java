public class Main {
    public static void main(String[] args) {
        Shape shape= new Shape();
        System.out.println(shape);
        Shape shape2 =new Shape("red", false);
        System.out.println(shape2);

        Circle circle= new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);



    }
}