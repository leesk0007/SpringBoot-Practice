package com.example.demo.product;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;

@Component
public class ProductRepository {
    private Map<Integer, String> db = new HashMap<>();

    public String getProduct() {
        return db.get(1);
    }

    public void saveProduct() {
        db.put(1,"NoteBook");
    }
}
