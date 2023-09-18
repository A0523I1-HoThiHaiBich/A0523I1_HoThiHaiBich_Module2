import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter the size:");
        size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("list[" + i + "]= ");
            list[i] = scanner.nextInt();
        }
        System.out.println("List= ");
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
        bubbleSortBystep(list);
    }

    public static void bubbleSortBystep(int[] list) {
        boolean flag = true;
        for (int i = 0; i < list.length - 1 && flag; i++) {
            flag = false;
            for (int j = list.length - 1; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j - 1]);
                    int temp;
                    temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println("list after sort:");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " , ");
        }
    }
}
