package service;

import bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceProductImpl implements ServiceProduct{
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"iphone 6",600,"iphone 6 made in china","China"));
        products.put(2,new Product(2,"sam sung",400,"sam sung made in viet nam","VietNamese"));
        products.put(3,new Product(3,"xiaomi",350,"xiaomi made in china","China"));
        products.put(4,new Product(4,"laptop",1200,"laptop hp made in china","China"));
        products.put(5,new Product(5,"sam sung note 5",550,"sam sung note 5 in viet nam,","VietNamese"));
        products.put(6,new Product(6,"sam sung s8",700,"sam sung s8 in viet nam,","VietNamese"));
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
        //products.containsValue();
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id,Product product) {
        products.put(id,product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public Product info(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> list = new ArrayList<>();
        for (Product product:products.values()) {
            if(product.getName().contains(name)){
                list.add(products.get(product.getId()));
            }
        }
        return list;
    }
}
