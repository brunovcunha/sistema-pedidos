package com.brunov.sistemapedidos.repository;

import com.brunov.sistemapedidos.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}