package Seminar3.HW3.TDD;

public class User {
    private String name;
    private String password;
    private boolean isAdmin;
    private boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isAuthenticate() {
        return this.isAuthenticate;
    }

    public void authenticate(String password) {
        if (this.password.equals(password)) this.isAuthenticate = true;
    }

    public void deAuthenticate() {
        this.isAuthenticate = false;
    }


}
