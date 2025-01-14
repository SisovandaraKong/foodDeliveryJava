package foodDeliveryApplication.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int idCounter = 1;
    private int orderId;
    private List<MenuItem> items;
    private String status;

    public Order() {
        this.orderId = idCounter++;
        this.items = new ArrayList<>();
        this.status = "Pending";
    }

    public void addItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public void removeItem(MenuItem menuItem) {
        items.remove(menuItem);
    }

    public float calculateTotal() {
        return (float) items.stream().mapToDouble(item -> item.price).sum();
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder("Order ID: " + orderId + "\nStatus: " + status + "\nItems:\n");
        for (MenuItem item : items) {
            details.append(item.getDetails()).append("\n");
        }
        details.append("Total: ").append(calculateTotal()).append("\n");
        return details.toString();
    }
}