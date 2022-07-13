package com.example.RESTDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductServiceController {

    private Map<String, Product> productRepo = new HashMap<>();

    ProductServiceController() {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("Honey");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product();
        almond.setId("2");
        almond.setName("Almond");
        productRepo.put(almond.getId(), almond);
    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>(productRepo.values(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@RequestBody Product product) {
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>(productRepo.values(), HttpStatus.UPGRADE_REQUIRED);
    }

    @RequestMapping(value = "/productsd", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteProduct(@RequestBody Product product) {
        productRepo.remove(product.getId());
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }
}


