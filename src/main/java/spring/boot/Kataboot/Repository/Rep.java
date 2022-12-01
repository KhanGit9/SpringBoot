package spring.boot.Kataboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import spring.boot.Kataboot.model.User;


@Repository
public interface Rep extends JpaRepository<User, Integer> {
}
