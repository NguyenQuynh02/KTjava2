package org.samsung.ktjava2.repositories;

import org.samsung.ktjava2.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
