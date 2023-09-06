package service.impl;

import model.Product;
import repository.IProductRepository;

import repository.impl.ProductRepository;
import service.IProductService;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
        @Override
        public void display() {
            Product[] products = productRepository.getListProduct();
            for (int i = 0; i < products.length; i++) {
                if (products[i] != null) {
                    System.out.println((i + 1) + "." + products[i]);
                }
            }
        }


    }







