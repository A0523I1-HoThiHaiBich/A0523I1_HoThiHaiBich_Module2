import java.util.Scanner;

public class CaculatorExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x= scanner.nextInt();
        System.out.println("Nhap y: ");
        int y= scanner.nextInt();
        CaculatorExample calc= new CaculatorExample();
        calc.caculate(x,y);

    }
    public void caculate(int x, int y){
        try{
            int a= x+y;
            int b= x-y;
            int c= x*y;
            int d= x/y;
            System.out.println(" Tong x + y = " +a);
            System.out.println(" Hieu x - y = " +b);
            System.out.println(" Tich x*y = " +c);
            System.out.println(" Thuong x: y = " +d);


        }catch (Exception e){
            System.err.println(" Xay ra ngoai le "+ e.getMessage());
        }


    }
}

