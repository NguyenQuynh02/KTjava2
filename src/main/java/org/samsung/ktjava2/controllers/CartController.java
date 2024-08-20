package org.samsung.ktjava2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/cart")
public class CartController {
    private Map<Long, Integer> cart = new HashMap<>();

    @GetMapping
    public String viewCart(Model model) {
        model.addAttribute("cart", cart);
        return "cart";
    }

    @PostMapping("/add")
    public String addToCart(@RequestParam("productId") Long productId) {
        cart.put(productId, cart.getOrDefault(productId, 0) + 1);
        return "redirect:/cart";
    }
}
