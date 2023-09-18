public class InsertSortingByStep {
    public static void main(String[] args) {
        int[] list= {4,1,5,-2,15,8,10,3};
        System.out.println("Mang ban dau:");
        for( int i=0; i<=list.length-1;i++) {
            System.out.print(list[i]+ " , ");
        }
        System.out.println("\n");
        insertionSortByStep(list);
        System.out.println("\n" +"Mang sau khi sort: ");
        for( int i=0; i<=list.length-1;i++) {
            System.out.print(list[i]+ " , ");
        }


    }
    public static void insertionSortByStep(int[] list){
        int current;
        int pos;
        for( int i=0;i<list.length; i++){
            System.out.println("*Loop " + i+"------------");
            current=list[i];
            pos=i;
            while( pos>0&& current<list[pos-1]){
                System.out.println("- Compare "+ current + " with "+ list[pos-1]+ "(if "+ current + "< " +list[pos-1]+ ")");
                System.out.println("  + Move " + list[pos-1]+ " from position "+ (pos-1) +" to positon " +(pos));
                list[pos]= list[pos-1];
                pos--;
            }
            System.out.println("  #Insert "+ current+ " at position "+ pos);
            list[pos]= current;

        }
    }
}
