package org.samsung.ktjava2.models;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String picture;
    private double price;

    @ManyToOne
    @JoinColumn(name = "catalog_id")
    private Catalog catalog;

    // Getters và Setters
}
