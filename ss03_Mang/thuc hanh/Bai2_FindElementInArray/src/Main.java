import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Anh", "Bich", "Bac", "Khoa", "Ngan", "Quan"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the find name:");
        String name = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                System.out.println(name + " found at index: " + (i + 1));
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println(name + " NOT found in list");
        }
    }
}