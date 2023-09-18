import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private int numNodes;
    private Node head;
    private Node tail;
    public MyLinkedList(Object data){
        head = new Node(data) ;
        tail= new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public  void add(int index, Object data){
        Node current= head;
        Node temp;
        if(index==0) addFirst(data);
        if(index>=numNodes) addLast(data);
        for(int i=0;i<index-1&&current.next!=null;i++){
            current=current.next;
        }
        temp= current.next;
        current.next=new Node(data);
        (current.next).next=temp;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp= head;
        head= new Node(data);
        head.next=temp;
        numNodes++;
    }
    public void addLast(Object data){
        Node last= new Node(data);
        tail.next=last;
        tail= tail.next;
        numNodes++;

    }

    public void printList(){
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
        Node current_tail=tail;
        System.out.println(current_tail.data);
    }

}
