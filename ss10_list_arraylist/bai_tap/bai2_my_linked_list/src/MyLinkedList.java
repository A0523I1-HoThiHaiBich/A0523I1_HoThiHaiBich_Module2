public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes;

    public class Node {
        private Node next;
        private Node prev;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        tail = new Node(data);
    }

    public void addFirst(E element) {
        Node fisrt = head;
        head = new Node(element);
        head.next = fisrt;
        numNodes++;
    }

    public void addLast(E element) {
        Node current = head;
        for (int i = 0; i < numNodes - 2; i++)
            current = current.next;
        if (current == tail) {
            Node last = new Node(element);
            tail.next = last;
            tail = tail.next;
            numNodes++;
            System.out.println(current.data);
        }

    }

    public void add(int index, E data) {
        Node current = head;
        Node temp;
        if (index == 0) addFirst(data);
        if (index >= numNodes) addLast(data);
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        temp = current.next;
        current.next = new Node(data);
        (current.next).next = temp;
        numNodes++;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public E removeFirst() {
        Node remove_node = head;
        head = head.next;
        numNodes--;
        return (E) remove_node.data;
    }

    public E removeLast() {
        Node remove_node = head;
        for (int i = 0; i < numNodes; i++) {
            remove_node = remove_node.next;
        }
        if (remove_node.next == tail) {
            tail = remove_node;
            remove_node.next = null;
        }
        numNodes--;
        return (E) remove_node.data;
    }


    public E remove(int index) {
        if (index == 0) removeFirst();
        if (index == numNodes - 1) removeLast();
            Node remove_node = head;
            for (int i = 1; i < index; i++) {
                remove_node = remove_node.next;}
                Node current = remove_node.next;
                remove_node.next = current.next;
                numNodes--;
            return (E) remove_node.data;
        }
}