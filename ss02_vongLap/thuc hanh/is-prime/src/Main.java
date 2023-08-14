import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so number:");
        int number= sc.nextInt();
        if(number<2){
            System.out.println(number + " is not prime");
        }
        else{
            boolean flag=true;
            for( int i=2;i<number;i++){
                if(number%i ==0){
                    flag= false;
                    break;
                }
            }
            if(flag==false){
                System.out.println(number+ " is not prime");
            } else System.out.println(number+ " is prime");
        }
    }
}