import payment.Payment;
import about.About;
import login.Login;

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

        About about = new About();
        about.displayInfo();
    }
}
