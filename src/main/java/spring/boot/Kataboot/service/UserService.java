package spring.boot.Kataboot.service;


import spring.boot.Kataboot.model.User;

import java.util.List;
public interface UserService {
    void add(User user);
    void remove(int id);
    void update(int id, User user);
    List<User> getAllUsers();
    public User get(int id);
}
