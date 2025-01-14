package foodDeliveryApplication.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<MenuItem> menu;
    private List<Order> orders;

    public Restaurant() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addToMenu(MenuItem item) {
        menu.add(item);
    }

    public void viewMenu() {
        for (MenuItem item : menu) {
            System.out.println(item.getDetails());
        }
    }

    public void processOrder(Order order) {
        order.updateStatus("Preparing");
        orders.add(order);
        System.out.println("Order processed: " + order.getOrderDetails());
    }
}
