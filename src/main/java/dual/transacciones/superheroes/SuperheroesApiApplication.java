package dual.transacciones.superheroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class SuperheroesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperheroesApiApplication.class, args);
	}

	@Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Superheroes")
                        .description(
                        "Java 8, Spring-boot 2.6.3"));
    }
}
