package controller;

import service.IProductService;
import service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenu(){
        IProductService productService= new ProductService();
        Scanner scanner= new Scanner(System.in);
        boolean flag=true;
        do{
            System.out.println("Select the funtion:");
            System.out.println(" 1.Display" +
                    "\n 2.Add" +
                    "\n 3.Edit" +
                    "\n 4.Delete" +
                    "\n 5.Search" +
                    "\n 6.Exit");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Code function Display.");
                    productService.display();
                    break;
                case 2:
                    System.out.println("Code function Add new.");
                    productService.add();
                    break;
                case 3:
                    System.out.println("Code function Update.");
                    productService.update();

                    break;
                case 4:
                    System.out.println("Code function Delete.");
                    productService.delete();
                    break;
                case 5:
                    System.out.println("Code function Search.");
                    productService.search();
                    break;
                case 6:
                    flag=false;

            }
        }while(flag);
    }
}
