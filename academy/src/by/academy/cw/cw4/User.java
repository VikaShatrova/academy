package by.academy.cw.cw4;

public class User {
    private String login;
    private String password;

    public User() {
        super();
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query q = new Query(this);
        q.printToLog();
    }

    public static class Query {
        User user;

        public Query(User user) {
            this.user = user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public void printToLog() {
            System.out.println("пользователь с логином " + user.login + " отправил запрос");
        }
    }

    static Printable pr = new Printable() {
        @Override
        public void print() {
            System.out.println("anonym");
        }
    };

    public static void main(String[] args) {
        User a = new User("user", "12345");
        a.createQuery();
//        User.Query query = a.new Query();
//        query.printToLog();
        pr.print();

    }
}
