package spring.boot.Kataboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class KatabootApplication {

	public static void main(String[] args) {
		SpringApplication.run(KatabootApplication.class, args);
	}

}
