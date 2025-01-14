package foodDeliveryApplication;

import foodDeliveryApplication.model.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.addToMenu(new FoodItem("Noodle", 7.99f, "Delicious noodles with vegetables and sauce", new String[]{"Noodles", "Vegetables", "Sauce"}));
        restaurant.addToMenu(new FoodItem("Soup", 4.99f, "Warm and hearty vegetable soup", new String[]{"Carrots", "Potatoes", "Broth"}));
        restaurant.addToMenu(new DrinkItem("Coffee", 2.99f, "Hot brewed coffee", "Medium"));
        restaurant.addToMenu(new DrinkItem("Energy Drink", 3.99f, "Boost your energy with this refreshing drink", "Large"));

        User user = new User(1, "Dara");
        Scanner scanner = new Scanner(System.in);

        Order currentOrder = new Order();

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. View Items");
            System.out.println("2. Order Item");
            System.out.println("3. View Order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Items:");
                    restaurant.viewMenu();
                    break;

                case 2:
                    System.out.println("\nAvailable Items:");
                    restaurant.viewMenu();
                    System.out.print("Enter the name of the item to order: ");
                    String itemName = scanner.nextLine();

                    MenuItem selectedItem = restaurant.getMenuItemByName(itemName);

                    if (selectedItem != null) {
                        currentOrder.addItem(selectedItem);
                        System.out.println("Added " + selectedItem.name + " to your order.");
                    } else {
                        System.out.println("Item not found. Please try again.");
                    }
                    break;

                case 3:
                    if (currentOrder != null && !currentOrder.getOrderDetails().isEmpty()) {
                        System.out.println("\nYour Current Order:");
                        System.out.println(currentOrder.getOrderDetails());
                    } else {
                        System.out.println("You haven't ordered anything yet.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Food Delivery Application!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
