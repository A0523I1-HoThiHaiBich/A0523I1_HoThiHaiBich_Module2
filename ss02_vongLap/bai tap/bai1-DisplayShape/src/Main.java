import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menu:\n" +
                "\n" +
                "1.Print the rectangle\n" +
                "\n" +
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "\n" +
                "3.Print isosceles triangle\n" +
                "\n" +
                "4.Exit"+
                "\n"+
                "Please choose the number:");
        Scanner sc= new Scanner(System.in);
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Nhap chieu dai HCN:");
                int width= sc.nextInt();
                System.out.println("Nhap chieu rong HCN:");
                int height= sc.nextInt();
                for( int i=0; i<height;i++){
                    for(int j=0;j<width;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Nhap chieu cao tam giac vuong:");
                int high= sc.nextInt();
                for( int i=1; i<=high;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                System.out.println("---------------------------");
                for( int i=high; i>0;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                System.out.println("---------------------------");
//                for( int i=1; i<=high;i++){
//                    for(int j=high;j>i;j--){
//                        System.out.print("");
//                        for(int k=i;k>0;k--){
//                            System.out.print("*");
//                        }
//                    }
//                    System.out.print("\n");
//                }
//                System.out.println("---------------------------");



                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    }
