package com.company.shop.domain;

public class OrderVO {
    private int orderNo;
    private String memberId;
    private String productName;
    private int quantity;
    private int price;

    public OrderVO() {
    }

    public OrderVO(int orderNo, String memberId, String productName, int quantity, int price) {
        this.orderNo = orderNo;
        this.memberId = memberId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getTotalPrice() {
        return quantity * price;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "주문번호: " + orderNo
                + ", 회원ID: " + memberId
                + ", 상품명: " + productName
                + ", 수량: " + quantity
                + ", 가격: " + price
                + ", 총금액: " + getTotalPrice();
    }
}