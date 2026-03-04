package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class ProductController {
    @Autowired
    private ProductService productService;

    ProductController(){
        System.out.println("진짜 얘가 알아서 생성하나..");
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public String getProduct(@PathVariable(value="id") int id){
        return productService.getProduct(id);
    }
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }
}
