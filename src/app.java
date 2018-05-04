import bean.Product;
import service.ServiceProductImpl;

import java.util.HashMap;
import java.util.Map;

public class app {
    public static void main(String[] args) {
//        Map<Integer,Product> products = new HashMap<>();
//        products.put(1,new Product(1,"iphone 6",600,"iphone 6 made in china","China"));
//        products.put(2,new Product(2,"sam sung",400,"sam sung made in viet nam","VietNamese"));
//        products.put(3,new Product(3,"xiaomi",350,"xiaomi made in china","China"));
//        products.put(4,new Product(4,"laptop",1200,"laptop hp made in china","China"));
//        System.out.println(products.containsValue("sam sung"));
//        for (Product product:products.values()) {
//            if(product.getName().startsWith("sam")){
//                System.out.println(product.getName());
//            }
//        }



        ServiceProductImpl s = new ServiceProductImpl();
        for (Product product:s.findByName("sam")) {
            System.out.println(product.toString());
        }
    }
}
