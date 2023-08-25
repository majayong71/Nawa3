package Nawa3.Nawa3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Nawa3Application {

	public static void main(String[] args) {
		SpringApplication.run(Nawa3Application.class, args);
	}

}
