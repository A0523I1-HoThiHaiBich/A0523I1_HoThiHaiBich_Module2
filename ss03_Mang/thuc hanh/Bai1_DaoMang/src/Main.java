import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Hay nhap size cua mang:");
            size= sc.nextInt();
            if(size>20){
                System.out.println("Size khong vuot qua 20. Hay nhap lai");
            }
        }while(size>20);
        array = new int[size];
        for( int i=0; i<size;i++){
            System.out.println(" Nhap phan tu "+ i+":");
            array[i]= sc.nextInt();
        }
        System.out.println("Mang ban dau:");
        for( int i=0; i<size;i++){
            System.out.print(array[i]+"\t");
        }
        int temp;
        for(int i=0; i<size/2;i++){
            temp=array[i];
            array[i]= array[size-1-i];
            array[size-1-i]=temp;
        }

        System.out.println("\nMang dao nguoc:");
        for( int i=0; i<size;i++){
            System.out.print(array[i]+"\t");
        }

    }


}
