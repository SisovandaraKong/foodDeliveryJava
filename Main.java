package foodDeliveryApplication;

import foodDeliveryApplication.model.*;


public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.addToMenu(new FoodItem("Sach klem", 12.00f, "Pus ko", new String[]{"Tlerm", "100srotorb", "sout"}));
        restaurant.addToMenu(new DrinkItem("Hanuman", 1.5f, "Pherk hz sverng", "keo thom"));


        System.out.println("Restaurant Menu:");
        restaurant.viewMenu();


        User user = new User(1, "Koko");
        Order order = new Order();
        order.addItem(new FoodItem("Sach klem", 15.00f, "Sach ko and sach morn", new String[]{"Sach ko", "Sach morn", "Kreoung"}));
        order.addItem(new DrinkItem("Anchor", 1.5f, "Pherk hz sverng", "Keo toch"));


        restaurant.processOrder(order);


        user.placeOrder(order);


        System.out.println("\nOrder History:");
        user.viewOrderHistory();
    }
}
