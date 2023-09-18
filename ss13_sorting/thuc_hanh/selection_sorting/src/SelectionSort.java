public class SelectionSort {

    public static void main(String[] args) {
        int[] list={1,4,9,2,-3,5,10};
        System.out.println("Mang ban dau: ");
        for( int i=0; i<=list.length-1;i++) {
            System.out.print(list[i]+ " , ");
        }
        selectionSort(list);
        System.out.println("\n" +"Mang sau khi sort: ");
        for( int i=0; i<=list.length-1;i++) {
            System.out.print(list[i]+ " , ");
        }

    }
    public static void selectionSort(int[] list){
        for( int i=0; i<list.length-1;i++){
            int min=list[i];
            int min_index= i;
            for( int j=i+1; j<list.length;j++){
                if( min>list[j]){
                    min= list[j];
                    min_index=j;
                }
            }
            if( min_index!=i){
                list[min_index]=list[i];
                list[i]=min;

            }

        }

    }

}
