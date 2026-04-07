import payment.Payment;
import auth.Auth;
import about.About;
import login.Login;
import order.Order;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Java Application!");
        Payment payment = new Payment();
        String paymentMethod = "Credit Card";
        double amount = 100.00;
        payment.processPayment(paymentMethod, amount);
        Login login = new Login();
        String username = "john_doe";
        String password = "password123";
        login.loginUser(username, password);
        Auth auth = new Auth();
        boolean isAuthenticated = auth.authenticateUser(username, password);
        if (isAuthenticated) {
            System.out.println("User authenticated successfully.");
        } else {
            System.out.println("Authentication failed.");
        }

        About about = new About();
        about.displayInfo();

        Order order = new Order();
        String product = "Laptop";
        int quantity = 2;
        order.placeOrder(product, quantity);
        int orderId = 12345;
        order.cancelOrder(orderId);
    }
}
