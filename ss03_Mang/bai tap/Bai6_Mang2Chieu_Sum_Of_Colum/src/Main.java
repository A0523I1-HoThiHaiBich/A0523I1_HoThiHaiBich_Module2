import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int col, row;
        System.out.println("Enter the col of array:");
        col = sc.nextInt();
        System.out.println("Enter the row of array:");
        row = sc.nextInt();
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
        int index_col;
        do {
            System.out.println("Enter the col to count sum:");
            index_col = sc.nextInt();
            if (index_col < 0 || index_col > col-1)
                System.out.println("Please choose the col from 0 to " + (col-1));
        } while (index_col < 0 || index_col > col-1);

        for (int i = 0; i < col; i++) {
            if( i==index_col){
                for (int j = 0; j < row; j++) {
                    sum += array[j][i];
                }
                }
        }
        System.out.println("Sum of col= "+index_col+" in array: " + sum);
    }
}