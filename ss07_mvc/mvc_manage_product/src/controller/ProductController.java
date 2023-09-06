package controller;

import service.IProductService;
import service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenu(){
        IProductService productService = new ProductService();
      Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        do{
            System.out.println("Select the function:");
            System.out.println("1.Display" +
                    "\n 2.Add" +
                    "\n 3.Edit" +
                    "\n 4.Delete" +
                    "\n 5.Exit"
            );
            int choose= Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Coding function Display:");
                    productService.display();
                    break;
                case 2:
                    System.out.println("Coding function Add new");
//                    productService.add();
                    break;
                case 3:
                    System.out.println("Coding function Update:");
//                    productService.update();
                    break;
                case 4:
                    System.out.println("Coding function Delete:");
//                    productService.delete();
                    break;
                case 5:
                    flag=false;
            }
        }while(flag);
    }
}
