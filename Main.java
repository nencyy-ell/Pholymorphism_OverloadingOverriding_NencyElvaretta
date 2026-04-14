public class Main {
    public static void main(String[] args) {

        // POLIMORFISME + OVERRIDING
        User u1 = new EmailLogin();
        u1.login("user@gmail.com", "123");

        User u2 = new GoogleLogin();
        u2.login("user", "123");

        // OVERLOADING
        ManualLogin m = new ManualLogin();
        m.login("username123", "123");
        m.login("user@gmail.com", "123", true);
    }
}