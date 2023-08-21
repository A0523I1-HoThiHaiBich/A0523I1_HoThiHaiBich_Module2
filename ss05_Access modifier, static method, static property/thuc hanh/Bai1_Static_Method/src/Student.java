public class Student {
    private int rollno;
    private String name;
    private static String college="BBTT";

    public Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change(){
        college="CodeGym";

    }
    void display(){
        System.out.println(rollno+ " "+ name + " " + college);
    }
}
