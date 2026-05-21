package com.company.shop.service;

import java.util.List;

import com.company.shop.domain.OrderVO;
import com.company.shop.repository.OrderRepository;

public class OrderService {
    private final OrderRepository orderRepository = new OrderRepository();

    public OrderVO createOrder(String memberId, String productName, int quantity, int price) {
        return orderRepository.save(memberId, productName, quantity, price);
    }

    public List<OrderVO> getOrderList() {
        return orderRepository.findAll();
    }

    public OrderVO getOrder(int orderNo) {
        return orderRepository.findByOrderNo(orderNo);
    }
}
