package my.website;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;




@SpringBootApplication
@EnableEurekaClient
public class GetsUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetsUpApplication.class, args);
	}

}
