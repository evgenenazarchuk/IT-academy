package by.academy.homework.homework_7.Task2;

public class User extends Person {
    public String login;
    private String password;
    public String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void printUserInfo() {
        System.out.println("Person");
    }
}
