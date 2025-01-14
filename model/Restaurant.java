package foodDeliveryApplication.model;

import foodDeliveryApplication.model.MenuItem;
import foodDeliveryApplication.model.Order;

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

    public MenuItem getMenuItemByName(String name) {
        for (MenuItem item : menu) {
            if (item.name.equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void processOrder(Order order) {
        order.updateStatus("Preparing");
        orders.add(order);
        System.out.println("Order processed: " + order.getOrderDetails());
    }

    public void viewOrders() {
        for (Order order : orders) {
            System.out.println(order.getOrderDetails());
        }
    }
}
