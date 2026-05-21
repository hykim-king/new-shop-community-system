package com.company.shop.controller;

import java.util.List;

import com.company.shop.domain.OrderVO;
import com.company.shop.service.OrderService;
import com.company.shop.view.OrderView;

public class OrderController {
    private final OrderService orderService = new OrderService();
    private final OrderView orderView = new OrderView();

    public void start() {
        while (true) {
            int menu = orderView.showMenu();

            switch (menu) {
                case 1:
                    createOrder();
                    break;
                case 2:
                    showAllOrders();
                    break;
                case 3:
                    showOrder();
                    break;
                case 0:
                    orderView.printMessage("주문 프로그램을 종료합니다.");
                    return;
                default:
                    orderView.printMessage("잘못 입력했습니다.");
            }
        }
    }

    private void createOrder() {
        String memberId = orderView.inputMemberId();
        String productName = orderView.inputProductName();
        int quantity = orderView.inputQuantity();
        int price = orderView.inputPrice();

        OrderVO order = orderService.createOrder(memberId, productName, quantity, price);

        orderView.printMessage("주문이 등록되었습니다.");
        orderView.printOrder(order);
    }

    private void showAllOrders() {
        List<OrderVO> orderList = orderService.getOrderList();
        orderView.printOrderList(orderList);
    }

    private void showOrder() {
        int orderNo = orderView.inputOrderNo();
        OrderVO order = orderService.getOrder(orderNo);
        orderView.printOrder(order);
    }

    public static void main(String[] args) {
        new OrderController().start();
    }
}
