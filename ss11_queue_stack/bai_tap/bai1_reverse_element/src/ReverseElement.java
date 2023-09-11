import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("Array= " + stack);
//
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("Reverse Array= " + stack);
    }
}


