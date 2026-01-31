public class User {

    String username;
    int age;
    String email;

    public User(){}

    public User(String username) {
        this.username = username;
    }

    public User(String username, int age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }
}
