package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.sql.SQLOutput;

public class ProductRepository implements IProductRepository {
    private static Product[] products = new Product[10];

    static {
        products[0] = new Product(1, "Book", 1000, "Book");
        products[1] = new Product(2, "Pen", 2000, "Pen");
        products[2] = new Product(3, "NoteBook", 12000, "NoteBook");
    }

    @Override
    public Product[] getListProduct() {
        return products;
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    @Override
    public void deleteProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)) {
                products[i] = null;
                break;
            }
        }
    }

    public void updateProduct(int idUpdate, Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == idUpdate) {
                products[i] = product;
                break;
            }else System.out.println("Can't find the product.");

        }
    }
    public void searchByName( String name){
        boolean flag=true;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)) {
                System.out.println(products[i]);
                break;
            }else flag=false;
        }
        if (flag==false){
            System.out.println("Can't find the product.");
        }
    }
}
