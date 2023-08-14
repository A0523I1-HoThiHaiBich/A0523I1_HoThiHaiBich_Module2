import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int min;
        int index = 0;
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + i + " =");
            array[i] = sc.nextInt();
        }
        System.out.println(" Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("min in array:" + min + "at position:" + index);

    }
}
