class ManualLogin extends User {

    // overriding juga (optional tapi valid)
    @Override
    void login(String username, String password) {
        System.out.println("Login pakai Username: " + username);
    }

    // OVERLOADING
    void login(String email, String password, boolean isEmail) {
        System.out.println("Login pakai Email: " + email);
    }
}