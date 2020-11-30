package by.academy.classwork.classwork_10;

public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        Query q = new Query();
        q.printToLog();
    }
    public class Query {
        void printToLog() {
            System.out.println("Пользователь c логином отправил запрос " + login +" пароль " +password);
        }

    }
}


