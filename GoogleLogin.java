class GoogleLogin extends User {

    @Override
    void login(String username, String password) {
        System.out.println("Login menggunakan Google Account");
    }
}