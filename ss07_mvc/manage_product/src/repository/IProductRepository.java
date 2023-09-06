package repository;

import model.Product;

public interface IProductRepository {
    Product[] getListProduct();
    void addProduct(Product product);

    void deleteProduct(String name);

    void updateProduct(int idUpdate, Product product);

    void searchByName(String name);

}
