import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] array;
        int number;
        int index=0;
        System.out.println("Enter the size:");
        int size= sc.nextInt();
        array= new int[size+5];
        for( int i=0; i<size;i++){
            System.out.println("Element "+i +" =");
            array[i]= sc.nextInt();
        }
        System.out.println(" Array: ");
        for( int i=0; i<size;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("\n Enter the number need to insert:");
        number= sc.nextInt();
        int position;
        do{
            System.out.println("\n Enter the position need to insert:");
            position= sc.nextInt();
            if(position<1||position>array.length-1){
                System.out.println("Can't insert at positio"+position);
            }
        }while (position<1||position>array.length-1);

            for( int i= size+1; i>position;i--){
                array[i]=array[i-1];
            }
            array[position]=number;
            System.out.println("Array after insert:");
            for( int i=0; i<size+1;i++){
                System.out.print(array[i]+ "\t");
            }

    }
}