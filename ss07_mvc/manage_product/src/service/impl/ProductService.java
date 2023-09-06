package service.impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.util.Scanner;

public class ProductService implements IProductService {

 private IProductRepository  productRepository = new ProductRepository();
    @Override
    public void display() {
        Product[] products = productRepository.getListProduct();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println((i + 1) + "." + products[i]);
            }
        }

    }
    public void add(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the id:");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the product name:");
        String name= scanner.nextLine();

        System.out.println("Enter the price:");
        double price= Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the description:");
        String description= scanner.nextLine();
        Product product =new Product(id,name,price,description);
        productRepository.addProduct(product);

    }
    public void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name product to delete:");
        String name= scanner.nextLine();
        productRepository.deleteProduct(name);

    }
    public void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Product id need to update:");
        int idUpdate= Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the id:");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the product name:");
        String name= scanner.nextLine();

        System.out.println("Enter the price:");
        double price= Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the description:");
        String description= scanner.nextLine();
        Product product =new Product(id,name,price,description);
        productRepository.updateProduct(idUpdate,product);
    }

    @Override
    public void search() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name product:");
        String name= scanner.nextLine();
        productRepository.searchByName(name);

    }
}
