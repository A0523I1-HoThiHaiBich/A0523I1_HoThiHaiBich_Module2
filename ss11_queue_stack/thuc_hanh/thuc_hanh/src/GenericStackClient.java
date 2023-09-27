import java.util.EmptyStackException;
import java.util.LinkedList;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfString();
        stackOfInteger();
    }
    private static void stackOfString(){
        MyGenericStack<String> stack= new MyGenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        System.out.println("1.1 Size of stack is: "+stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf( stack.pop());
            System.out.println("\n"+"Size of stack after pop "+ stack.size());
        }


    }
    private static void stackOfInteger(){
        MyGenericStack<Integer> stack= new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("2.1Size of stack is: " +stack.size());
        System.out.println("2.2 Pop element form stack");
        while (!stack.isEmpty()){
            System.out.println("Size of stack after pop "+ stack.pop() +" is "+ stack.size());
        }

    }

}
