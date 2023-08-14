import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1;
        int size1, size2;
        System.out.println("Enter the size of array1:");
        size1 = sc.nextInt();
        array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Element " + i + " =");
            array1[i] = sc.nextInt();
        }
        int[] array2;
        System.out.println("Enter the size of array2:");
        size2 = sc.nextInt();
        array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Element " + i + " =");
            array2[i] = sc.nextInt();
        }

        int[] array3;
        int size3 = size1 + size2;
        array3 = new int[size3];

        System.out.println(" Array1: ");
        for (int i = 0; i < size1; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println("\n Array2: ");
        for (int i = 0; i < size2; i++) {
            System.out.print(array2[i] + "\t");
        }
        System.out.println("\n Array3: ");
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
            System.out.print(array3[i] + "\t");
        }

        for (int i = size1; i < size3; i++) {
            for (int k = 0; k < size2; k++) {
                array3[i] = array2[k];
                System.out.print(array3[i] + "\t");
            }
            break;

        }
    }
}