import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width= sc.nextDouble();
        System.out.println("Enter the heigh:");
        double heigh= sc.nextDouble();
        Rectangle rectangle =new Rectangle(width,heigh);
        System.out.println("Your rectange:  "+ rectangle.display());
        System.out.println("The area of rectangle:"+ rectangle.getArea(width,heigh));
        System.out.println("The premeter of rectangle:"+ rectangle.getPremeter(width,heigh));
    }
}