package spring.boot.Kataboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.Kataboot.model.User;
import spring.boot.Kataboot.reposytory.UserReposytory;

import java.util.List;
@Service
public class UserServiceImpl implements UserService  {
    private final UserReposytory userReposytory;
    @Autowired
    public UserServiceImpl(UserReposytory userReposytory) {
        this.userReposytory = userReposytory;
    }

    @Transactional
    @Override
    public void add(User user) {
        userReposytory.save(user);
    }

    @Transactional
    @Override
    public void remove(int id) {
        userReposytory.deleteById(id);
    }

    @Transactional
    @Override
    public void update(int id, User user) {
        user.setId(id);
        userReposytory.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userReposytory.findAll();
    }

    @Override
    public User get(int id) {
        return userReposytory.findById(id).get();
    }
}
