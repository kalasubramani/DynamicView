package com.example.dynamicview;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  
 @RequestMapping("/home/{color}")

public String home(
      @PathVariable String color,    
      Model page) {
    page.addAttribute("username", "Ka");
    page.addAttribute("color", color);
    return "home.html";
  }
  
  // public String home(@RequestParam(required = false) String color,
  //                   @RequestParam("username") String username,                   
  //                    Model page)
  
  }

