package com.company.shop.repository;

import java.util.ArrayList;
import java.util.List;

import com.company.shop.domain.OrderVO;

public class OrderRepository {
    private final List<OrderVO> orderList = new ArrayList<>();
    private int sequence = 1;

    public OrderVO save(String memberId, String productName, int quantity, int price) {
        OrderVO order = new OrderVO(sequence++, memberId, productName, quantity, price);
        orderList.add(order);
        return order;
    }

    public List<OrderVO> findAll() {
        return new ArrayList<>(orderList);
    }

    public OrderVO findByOrderNo(int orderNo) {
        for (OrderVO order : orderList) {
            if (order.getOrderNo() == orderNo) {
                return order;
            }
        }
        return null;
    }
}
