package ex01;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExApplication { // Bootstrapping Class

	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greetings", "hello world");
	}

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args);){
			System.out.println("ExApplication runs.. " + ac.getBean("myMap", Map.class).get("greetings"));
		}
	}
}
