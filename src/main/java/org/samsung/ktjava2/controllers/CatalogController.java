package org.samsung.ktjava2.controllers;

import org.springframework.ui.Model;
import org.samsung.ktjava2.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalogs")
public class CatalogController {
    @Autowired
    private CatalogRepository catalogRepository;

    @GetMapping
    public String listCatalogs(Model model) {
        model.addAttribute("catalogs", catalogRepository.findByStatusTrue());
        return "catalogs";
    }
}

