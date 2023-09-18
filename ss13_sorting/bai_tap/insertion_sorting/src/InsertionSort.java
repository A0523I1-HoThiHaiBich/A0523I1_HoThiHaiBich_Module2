public class InsertionSort {
    public static void main(String[] args) {
        int[] list= {1,4,5,-2,15,8,10,3};
        System.out.println("Mang ban dau:");
        for( int i=0; i<=list.length-1;i++) {
            System.out.print(list[i]+ " , ");
        }
        insertionSort(list);
        System.out.println("\n" +"Mang sau khi sort: ");
        for( int i=0; i<=list.length-1;i++) {
            System.out.print(list[i]+ " , ");
        }

    }
    public static void insertionSort(int[] list){
        int current;
        int pos;
        for ( int i=0;i<list.length;i++){
            current=list[i];
            pos=i;
            while(pos>0&&current<list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=current;

        }

    }
}
