package repository.impl;

import model.Product;
import repository.IProductRepository;

public class ProductRepository implements IProductRepository {
    private static Product[]  products = new Product[10];
    static {
        products[0]= new Product(1,"Book",1000,"Book");
        products[1]= new Product(2,"Pen",2000,"Pen");
        products[2]= new Product(3,"NoteBook",12000,"NoteBook");
    }

    @Override
    public Product[] getListProduct() {
        return products;
    }
}
