package ex02.runner;

import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ex02.ExApplication;

public class HelloWorldRunner implements ApplicationRunner {

	private Map<?,?> map;
	
	public HelloWorldRunner(Map<?, ?> map) {
		this.map=map;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ExApplication runs.. " + map.get("greetings"));
	}

}
