package com.example.dynamicview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dynamicview.model.Product;
import com.example.dynamicview.service.ProductService;

@Controller
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @RequestMapping("/products")
  // @GetMapping("/products")
  public String viewProducts(Model model) {
    var productList = productService.viewProducts();
    model.addAttribute("products", productList);
 // productService.clearProductList();
    return "products.html";
      

  }

  // @RequestMapping(path="/products", method = RequestMethod.POST)
  @PostMapping("/products")

  public String addProduct(@RequestParam String name,
      @RequestParam double price,
      Model model) {

    Product product = new Product();
    product.setName(name);
    product.setPrice(price);
    productService.addProduct(product);

    var productList = productService.viewProducts();
    model.addAttribute("products", productList);

    return "products.html";

  }
}
