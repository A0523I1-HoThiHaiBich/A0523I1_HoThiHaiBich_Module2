import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        SelectionSort ob = new SelectionSort();
        int n = 1000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.round(Math.random()*(100 - 1) + 1);
        }

        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.sort(arr);
        stopWatch.start();
        System.out.println("Counting....");
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
        stopWatch.end();
        stopWatch.getElapsedTime();


    }
}