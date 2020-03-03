package projetynov.categorie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication

public class CategorieApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategorieApplication.class, args);
	}

}
