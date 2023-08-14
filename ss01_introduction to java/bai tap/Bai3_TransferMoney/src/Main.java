import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rate=23000;
        Scanner sc =new Scanner(System.in);
        System.out.println("Hãy nhập số tiền muốn quy đổi(USD):");
        double usd= sc.nextDouble();
        double vnd= usd*rate;
        System.out.printf(usd +" USD = "+ vnd+ " VND");
    }
}