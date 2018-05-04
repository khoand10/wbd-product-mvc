package service;

import bean.Product;

import java.util.List;

public interface ServiceProduct {
    List<Product> getAll();
    void create(Product product);
    void update(int id,Product product);
    void delete(int id);
    Product info(int id);
    List<Product> findByName(String name);
}
