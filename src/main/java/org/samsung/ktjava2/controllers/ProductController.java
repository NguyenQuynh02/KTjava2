package org.samsung.ktjava2.controllers;


import org.springframework.ui.Model;
import org.samsung.ktjava2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/search")
    public String searchProducts(@RequestParam("name") String name, Model model) {
        model.addAttribute("products", productRepository.findByNameContaining(name));
        return "products";
    }
}
