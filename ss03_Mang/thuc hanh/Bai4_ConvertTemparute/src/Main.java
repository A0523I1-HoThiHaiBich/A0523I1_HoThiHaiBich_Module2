import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            System.out.println("1. Fahrenheit to Celsius\n" +
                    "\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "\n" +
                    "0. Exit "+
                    "\n Enter your choice:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            double cel;
            double fah;
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter the fahrenheit:");
                    fah = sc.nextDouble();
                    System.out.println(fah + " F = " + fahToCel(fah));
                    break;
                case 2:
                    System.out.println("Enter the celsius:");
                    cel = sc.nextDouble();
                    System.out.println(cel + " C = " + celToFah(cel));
                    break;
            }
        }

        public static double celToFah(double celsius) {
            double fahh = (9.0 / 5) * celsius + 32;
            return fahh;
        }

        public static double fahToCel(double fahrenheit) {
            double cell = (5.0 / 9) * (fahrenheit - 32);
            return cell;
        }
    }

