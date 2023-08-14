import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] propertyList;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the size:");
            size= sc.nextInt();
            if( size>20){
                System.out.println("Size can't exceed 20!");
            }
        }while (size>20);
        propertyList =new int[size];
        for( int i=0; i< size; i++){
            System.out.println("Enter element "+ i);
            propertyList[i]= sc.nextInt();
        }
        System.out.println(" Property list:");
        for (int i=0; i<size;i++){
            System.out.print(propertyList[i]+ "\t");
        }
        int max= propertyList[0];
        for (int i=1;i<size;i++){
            if(propertyList[i]> max){
                max=propertyList[i];
            }
        }
        System.out.println("\n Max in property list is:" +max);
    }
}