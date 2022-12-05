package spring.boot.Kataboot.reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.Kataboot.model.User;
@Repository
public interface UserReposytory extends JpaRepository<User, Integer> {}
