package home;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Springboot Application main class
@SpringBootApplication
public class SpringBootRestObjectApplication {
//main class that runs springboot will run on port 8080 by default.
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestObjectApplication.class, args);
	}
}