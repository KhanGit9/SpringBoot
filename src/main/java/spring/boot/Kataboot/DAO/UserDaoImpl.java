package spring.boot.Kataboot.DAO;





import org.springframework.stereotype.Repository;
import spring.boot.Kataboot.model.User;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public UserDaoImpl () {}

    @Override
    public void add(User user) {

        entityManager.persist(user);
    }

    @Override
    public void remove(int id) {

        entityManager.remove(get(id));
    }

    @Override
    public void update(int id, User user) { entityManager.merge(user); }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User get(int id) {
        return entityManager.find(User.class, id);
    }

}
