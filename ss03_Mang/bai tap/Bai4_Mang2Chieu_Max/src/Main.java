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
                System.out.print(array[i][j] +"\t");
            }
            System.out.println("\n");
        }
        int max= array[0][0];
        int index_col=0, index_row=0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if(array[i][j]> max){
                    max= array[i][j];
                    index_col=i;
                    index_row=j;
                }
            }
        }
        System.out.println("Max in array: "+max +" at position: array["+index_col+"]["+index_row+"]" );

    }
}