import payment.Payment;
import student.Student;
import teacher.Teacher;
import auth.Auth;
import customer.Customer;
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

        Customer customer = new Customer();
        String name = "John Doe";
        String email = "johndoe@example.com";
        customer.addCustomer(name, email);
        int customerId = 1; // Example customer ID
        customer.removeCustomer(customerId);

        Order order = new Order();
        String product = "Laptop";
        int quantity = 2;
        order.placeOrder(product, quantity);
        int orderId = 12345;
        order.cancelOrder(orderId);

        Student student = new Student();
        String studentName = "Alice";
        int age = 20;
        student.addStudent(studentName, age);
        int studentId = 1; // Example student ID
        student.removeStudent(studentId);
        String course = "Computer Science";
        student.enrollCourse(studentId, course);
        System.out.println("Application execution completed.");
        Teacher teacher = new Teacher();
        String teacherName = "Jane Smith";
        String subject = "Mathematics";
        teacher.addTeacher(teacherName, subject);
        int teacherId = 1; // Example teacher ID
        teacher.removeTeacher(teacherId);
    }
}
