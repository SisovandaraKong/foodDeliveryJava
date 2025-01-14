package foodDeliveryApplication.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private List<Order> orderHistory;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orderHistory.add(order);
    }

    public void viewOrderHistory() {
        for (Order order : orderHistory) {
            System.out.println(order.getOrderDetails());
        }
    }
}
