import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float interestRate;
        int month;
        float money;
        float totalInterest=0;
        System.out.println("Nhap so tien gui:");
        money= sc.nextFloat();
        System.out.println("Nhap so thang gui:");
        month= sc.nextInt();
        System.out.println("Nhap ti le lai suat:");
        interestRate =sc.nextFloat();
        for( int i=0; i<=month;i++){
            totalInterest +=money*(interestRate/100)/12*month;
        }

        System.out.println("Tong so tien lai nhan douoc:"+ totalInterest);

    }
}