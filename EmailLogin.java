public class EmailLogin extends User {

    @Override
    void login(String email, String password) {
        System.out.println("Login menggunakan Email: " + email);
    }
}