package com.company.shop.view;

import java.util.List;
import java.util.Scanner;

import com.company.shop.domain.OrderVO;

public class OrderView {
    private final Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println();
        System.out.println("===== 주문 메뉴 =====");
        System.out.println("1. 주문 등록");
        System.out.println("2. 전체 주문 조회");
        System.out.println("3. 주문 번호로 조회");
        System.out.println("0. 종료");
        System.out.print("메뉴 선택: ");

        return Integer.parseInt(sc.nextLine());
    }

    public String inputMemberId() {
        System.out.print("회원 ID 입력: ");
        return sc.nextLine();
    }

    public String inputProductName() {
        System.out.print("상품명 입력: ");
        return sc.nextLine();
    }

    public int inputQuantity() {
        System.out.print("수량 입력: ");
        return Integer.parseInt(sc.nextLine());
    }

    public int inputPrice() {
        System.out.print("가격 입력: ");
        return Integer.parseInt(sc.nextLine());
    }

    public int inputOrderNo() {
        System.out.print("주문 번호 입력: ");
        return Integer.parseInt(sc.nextLine());
    }

    public void printOrder(OrderVO order) {
        if (order == null) {
            System.out.println("주문 정보가 없습니다.");
            return;
        }

        System.out.println(order);
    }

    public void printOrderList(List<OrderVO> orderList) {
        if (orderList.isEmpty()) {
            System.out.println("등록된 주문이 없습니다.");
            return;
        }

        for (OrderVO order : orderList) {
            System.out.println(order);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}