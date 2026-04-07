import payment.Payment;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Java Application!");
        Payment payment = new Payment();
        String paymentMethod = "Credit Card";
        double amount = 100.00;
        payment.processPayment(paymentMethod, amount);
    }
}
