public class BubbleSort {
    static int[] list={2,4,2,5,6,-1,-2,3,14,14};
    public static void bubbleSort(int[] list){
        boolean flag=true;
        for( int i=0; i< list.length-1&& flag;i++){
            flag=false;
            for (int j=list.length-1; j>0;j--){
                if( list[j]<list[j-1]){
                    int temp =list[j];
                    list[j]=list[j-1];
                    list[j-1]=temp;
                    flag=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Mang chua sap xep: ");
        for(int i=0;i<list.length-1;i++){
            System.out.print(list[i]+ " ");
        }
        bubbleSort(list);
        System.out.println("\n"+"Mang sau sap xep:");
        for(int i=0;i<list.length-1;i++){
            System.out.print(list[i]+ " ");
        }
    }

}
