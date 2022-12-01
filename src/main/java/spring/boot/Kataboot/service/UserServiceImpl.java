package spring.boot.Kataboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.Kataboot.Repository.Rep;
import spring.boot.Kataboot.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService  {
    private final Rep rep;

    @Autowired
    public UserServiceImpl (Rep rep) {
        this.rep = rep;
    }
    @Transactional
    @Override
    public void add(User user) {
         rep.save(user);
    }
    @Transactional
    @Override
    public void remove(int id) {

        rep.deleteById(id);
    }
    @Transactional
    @Override
    public void update(int id, User user) {
        user.setId(id);
        rep.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return rep.findAll();
    }

    @Override
    public User get(int id) {
        return rep.findById(id).get();
    }
}
