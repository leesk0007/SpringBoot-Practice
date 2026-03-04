package com.example.demo.product;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;

//@Component
@Repository
public class ProductRepository {
    private int id = 1;
    private Map<Integer, Product> db = new HashMap<>();

    public Product getProduct(int id) {
        return db.get(id);
    }

    public void saveProduct(Product product) {
        db.put(id++,product);
    }
}
