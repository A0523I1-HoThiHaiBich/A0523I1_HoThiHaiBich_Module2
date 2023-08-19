import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c= sc.nextDouble();
        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        double delta= quadraticEquation.getDiscriminant(a,b,c);
        if( delta<0){
            System.out.println("The equation has no roots");
        }else if(delta==0){
            System.out.println("The equation has one root, r= "+quadraticEquation.getRoot1(a,b,c));
        }else{
            System.out.println("The equation has two roots:"+"\n" +"r1= "+quadraticEquation.getRoot1(a,b,c)+ "\n"+"r2= "+quadraticEquation.getRoot2(a,b,c));
        }
    }
}