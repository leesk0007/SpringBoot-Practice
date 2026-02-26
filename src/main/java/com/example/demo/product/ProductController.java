package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ProductController {
    @Autowired
    private ProductService productService;

    ProductController(){
        System.out.println("진짜 얘가 알아서 생성하나..");
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String getProduct(){
        return productService.getProduct();
    }
    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public void saveProduct(@RequestParam(value="name") String productName) {
        productService.saveProduct(productName);
    }
}
