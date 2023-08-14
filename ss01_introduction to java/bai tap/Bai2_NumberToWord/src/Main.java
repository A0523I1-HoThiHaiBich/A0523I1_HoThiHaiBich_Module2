import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so number:");
        int number = scanner.nextInt();
        int tram, chuc, donVi;

        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }}
            if (number < 20&& number>=10) {
                donVi=number-10;
                switch (donVi) {
                    case 0:
                        System.out.println("ten");
                        break;
                    case 1:
                        System.out.println("eleven");
                        break;
                    case 2:
                        System.out.println("twelve");
                        break;
                    case 3:
                        System.out.println("thirteen");
                        break;
                    case 4:
                        System.out.println("fourteen");
                        break;
                    case 5:
                        System.out.println("fifteen");
                        break;
                    case 6:
                        System.out.println("sixteen");
                        break;
                    case 7:
                        System.out.println("seventeen");
                        break;
                    case 8:
                        System.out.println("eight teen");
                        break;
                    case 9:
                        System.out.println("nine teen");
                        break;

                }
            }
            if(20<= number&& number<100){
                chuc= number/10;
                donVi=number-(chuc*10);
                switch (chuc){
                    case 2:
                        System.out.println("twenty");
                        break;
                    case 3:
                        System.out.println("thirty");
                        break;
                    case 4:
                        System.out.println("fourty");
                        break;
                    case 5:
                        System.out.println("fifty");
                        break;
                    case 6:
                        System.out.println("sixty");
                        break;
                    case 7:
                        System.out.println("seventy");
                        break;
                    case 8:
                        System.out.println("eighty");
                        break;
                    case 9:
                        System.out.println("ninety");
                        break;
                }
            }

    }
}