package org.samsung.ktjava2.repositories;

import org.samsung.ktjava2.models.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatalogRepository extends JpaRepository<Catalog, Long> {
    List<Catalog> findByStatusTrue();
}

