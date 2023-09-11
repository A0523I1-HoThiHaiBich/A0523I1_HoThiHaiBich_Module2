public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList= new MyLinkedList<>(1);
        linkedList.addFirst(5);
        linkedList.addFirst(3);
       linkedList.addLast(2);
        linkedList.add(2,10);
        linkedList.add(5,20);
        linkedList.displayList();
        System.out.println("=========");
        linkedList.removeFirst();
        linkedList.displayList();
        System.out.println("=========");
        linkedList.remove(3);
        linkedList.displayList();


    }
}
