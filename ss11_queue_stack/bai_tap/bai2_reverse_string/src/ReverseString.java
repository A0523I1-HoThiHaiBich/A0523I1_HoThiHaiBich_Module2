import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        Stack<String> wStack= new Stack<>();
        String string=" hello A0523 My name is Bich";
        String[] mWord= string.split(" ");
        for(String w: mWord){
            wStack.push(w);
        }
        System.out.println(" String = " + wStack);

        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
        }
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        System.out.println(" Reverse String = " + wStack);

    }

}
