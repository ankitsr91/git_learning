package auth;

public class Auth {
    public Auth() {
        System.out.println("Auth class created");
    }

    public boolean authenticateUser(String username, String password) {
        // Placeholder for authentication logic
        System.out.println("Authenticating user: " + username);
        if (username.equals("john_doe") && password.equals("password123")) {
            return true; // Authentication successful
        } else {
            return false; // Authentication failed
        }
    }
}
