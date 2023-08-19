import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=" Helllo Every body!";
        char cha='l';
//        System.out.println("Enter the characters to count:");
//        cha =sc.next();
        int count=0;
        for(int i=0; i<str.length();i++){
            if((str.charAt(i))==(cha)){
                count++;
            }
        }
        System.out.println("Characters "+cha+ " display in string "+ count+ "times.");
    }
}