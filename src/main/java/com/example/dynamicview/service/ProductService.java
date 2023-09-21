package com.example.dynamicview.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dynamicview.model.Product;

@Service
public class ProductService {
  
  private List<Product> products = new ArrayList<>();

  public ProductService()
  {
    // Product p = new Product();
    // p.setName("sass");
    // p.setPrice(10011.00);
    // products.add(p);
  }
  

  public void addProduct(Product p)
  {
    products.add(p);
  }

  public List<Product> viewProducts()
  {
    return products;
  }

  public void clearProductList()
  {
    products.clear();
  }
}
