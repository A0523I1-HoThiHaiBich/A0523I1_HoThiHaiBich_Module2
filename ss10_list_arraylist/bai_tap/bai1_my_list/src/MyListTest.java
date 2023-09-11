import java.sql.SQLOutput;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list= new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0,2);
        list.add(1,15);
        list.add(2,5);

        list.printList();
        System.out.println(list.contains(5));
        System.out.println(list.indexOf(10));
        list.remove(1);
        list.printList();


    }
}
