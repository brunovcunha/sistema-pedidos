package com.brunov.sistemapedidos.repository;

import com.brunov.sistemapedidos.entity.OrderItem;
import com.brunov.sistemapedidos.entity.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}