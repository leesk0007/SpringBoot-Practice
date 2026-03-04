package com.example.demo.product;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;

@Component
public class ProductRepository {
    private int id = 1;
    private Map<Integer, Product> db = new HashMap<>();

    public String getProduct(int id) {
        return db.get(id).getName();
    }

    public void saveProduct(Product product) {
        db.put(id++,product);
    }
}
