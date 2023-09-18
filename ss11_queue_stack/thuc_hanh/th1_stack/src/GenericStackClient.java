public class GenericStackClient {
    public static void stackOfString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        System.out.println("Size of the stack after push: "+stack.size());
        System.out.println("Pop element form stack:");
        while (!stack.isEmpty()){
            System.out.printf("%s", stack.pop());
        }
        System.out.println("Size of the stack after push: "+stack.size());
    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack= new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Size of the stack after push: "+stack.size());
        System.out.println("Pop element form stack:");
        while (!stack.isEmpty()){
            System.out.printf("%d", stack.pop());
        }
        System.out.println("Size of the stack after push: "+stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of String:");
        stackOfString();
        System.out.println("2. Stack of Integers: ");
        stackOfIntegers();
    }

}
