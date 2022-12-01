package spring.boot.Kataboot.DAO;


import spring.boot.Kataboot.model.User;

import java.util.List;

public interface UserDao {
    void add (User user);
    void remove (int id);
    void update (int id, User user);
    List<User> getAllUsers ();
    User get (int id);
}
