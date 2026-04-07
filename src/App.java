import login.Login;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Java Application!");
        Login login = new Login();
        String username = "john_doe";
        String password = "password123";
        login.loginUser(username, password);
    }
}
