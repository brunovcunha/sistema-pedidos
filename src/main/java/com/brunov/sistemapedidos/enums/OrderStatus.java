package com.brunov.sistemapedidos.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getValue() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for(OrderStatus value : OrderStatus.values()){
            if (value.getValue() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("No enum constant with value " + code);
    }


}
