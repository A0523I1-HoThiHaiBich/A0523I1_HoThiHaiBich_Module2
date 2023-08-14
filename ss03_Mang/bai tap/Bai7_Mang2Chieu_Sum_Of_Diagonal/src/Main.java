import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int col, row;
        do {
            System.out.println("Enter the col of array:");
            col = sc.nextInt();
            System.out.println("Enter the row of array:");
            row = sc.nextInt();
            if(row!=col){
                System.out.println("Please enter the square matrix: col= row.");
            }

        }while(row!=col);

        array = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Element [" + i + j + "] =");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    if(i==j){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal of square array: " + sum);
    }
}