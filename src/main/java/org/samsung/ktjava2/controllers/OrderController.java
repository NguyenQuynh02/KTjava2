package org.samsung.ktjava2.controllers;

import org.samsung.ktjava2.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/submit")
    public String submitOrder(@AuthenticationPrincipal UserDetails userDetails) {
        // Xử lý đặt hàng ở đây
        return "redirect:/orders";
    }
}

