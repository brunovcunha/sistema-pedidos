package com.brunov.sistemapedidos.controller;

import com.brunov.sistemapedidos.entity.Order;
import com.brunov.sistemapedidos.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> Orders = orderService.findAllOrders();
        return ResponseEntity.ok(Orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getAllOrders(@PathVariable Long id) {
        Order Order = orderService.findOrderById(id);
        return ResponseEntity.ok(Order);
    }

}
