import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner= new Scanner(System.in);
        System.out.println("\n Nhap index :");
        int index= scanner.nextInt();
        try{
            System.out.println("Gia tri cua phan tu co index = "+index + " la: "+ arr[index]);

        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng.");
        }
    }
    public Integer[] createRandom(){
        Random random= new Random();
        Integer[] arr= new Integer[100];
        System.out.println("Danh sach cac phan tu cua mang:");
        for( int i=0; i<arr.length-1;i++){
            arr[i]= random.nextInt(100);
            System.out.print(arr[i]+ "  ");
        }
        return arr;
    }

}
