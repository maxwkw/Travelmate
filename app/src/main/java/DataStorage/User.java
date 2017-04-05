package DataStorage;

/**
 * Created by summerseo on 4/4/17.
 */

public class User {
    String username;
    String password;
    String name;
    int age;
    String gender;
    String email;
    String hobby;

    //username, password, name and age are basic requirements
    User(String username, String password, String name, int age){
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
    }
}
