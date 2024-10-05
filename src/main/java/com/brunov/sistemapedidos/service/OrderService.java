package com.brunov.sistemapedidos.service;

import com.brunov.sistemapedidos.entity.Order;
import com.brunov.sistemapedidos.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;


    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public Order findOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
