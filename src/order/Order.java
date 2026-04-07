package order;

public class Order {
    public Order() {
        System.out.println("Order class created");
    }

    public void placeOrder(String product, int quantity) {
        // Placeholder for order placement logic
        System.out.println("Placing order for " + quantity + " units of " + product);
    }

    public void cancelOrder(int orderId) {
        // Placeholder for order cancellation logic
        System.out.println("Cancelling order with ID: " + orderId);
    }
}
