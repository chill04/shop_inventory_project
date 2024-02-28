package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
@Controller
public class BuyNowController {
//    @GetMapping("/buyNow")
//    public String buyNow((@RequestParam("productID") int theId, Model theModel) {
//        ProductService productService = context.getBean(ProductServiceImpl.class);
//        Product theProduct = productService.findById(theId);
//        int inventoryInStock;
//        inventoryInStock = theProduct.getInv();
//
//
//        return "buy_now";
//    }
}
