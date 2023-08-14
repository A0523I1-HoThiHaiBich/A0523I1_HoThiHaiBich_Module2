import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        int number = 2;
        System.out.println("Nhap so luong STN muon hien thi:");
        n= sc.nextInt();

        System.out.println(n+ " first prime: \n");
        while (count <= n) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
                if (flag == false) {
                    number++;
                }
                else {
                    count++;
                    System.out.println(number );
                    number++;
                }
            }
        }
    }
