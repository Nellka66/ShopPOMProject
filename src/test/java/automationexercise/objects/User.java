package automationexercise.objects;

public class User {
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }

    private String password;
    private String email;



}
