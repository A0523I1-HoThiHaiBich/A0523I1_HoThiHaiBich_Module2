import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] array;
        int number;
        int index=0;
        System.out.println("Enter the size:");
        int size= sc.nextInt();
        array= new int[size];
        for( int i=0; i<size;i++){
            System.out.println("Element "+i +" =");
            array[i]= sc.nextInt();
        }
        System.out.println(" Array: ");
        for( int i=0; i<size;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("\n Enter the number need to delete:");
        number= sc.nextInt();
        boolean flag= false;
        for(int i=0; i<size;i++){
            if(array[i]==number){
                flag=true;
                index=i;
                break;
            }
        }
        if( flag==true){
            for( int i= index; i<size-1;i++){
                array[i]=array[i+1];
            }
            System.out.println("Array after delete:");
            for( int i=0; i<size-1;i++){
                System.out.print(array[i]+ "\t");
            }
        } else System.out.println(number+ " Not found to delete");
    }
}