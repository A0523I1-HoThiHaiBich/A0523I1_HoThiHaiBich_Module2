public class BinarySearch {
    public static void main(String[] args) {
         int[] list={1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,20));
        System.out.println(binarySearch(list,1));

    }

    public static int binarySearch(int[] list, int key){
        int left=0;
        int right=list.length-1;
        int mid;
        while ((left<right)){
            mid= (left+right)/2;
            if(key==mid){
                return mid;
            }else if( key>mid){
                left= mid+1;
            }
            else right=mid-1;
        }
        return -1;
    }
}
