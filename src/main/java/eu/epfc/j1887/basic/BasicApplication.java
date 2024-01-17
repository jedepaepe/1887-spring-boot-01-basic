package eu.epfc.j1887.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello " + name + "!";
	}

	@GetMapping("/coucou")
	public String coucou(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Coucou " + name + "!";
	}

	@GetMapping("/bonjour")
	public String bonjour(
			@RequestParam(value = "firstname", defaultValue = "Jean-Michel") String firstName,
			@RequestParam(value = "lastname", defaultValue = "Depaepe") String lastName) {
		return String.format("Bonjour %s %s", firstName, lastName);
	}

	@GetMapping("/")
	public String homePage() {
		return "home page";
	}

	@GetMapping("/addition")
	public String addition(@RequestParam(value = "x") int x, @RequestParam(value = "y") int y) {
		return String.format("%d + %d = %d", x, y, x + y);
	}

	@GetMapping("/multiplication")
	public String multiplication(@RequestParam(value = "x") int x, @RequestParam(value = "y") int y) {
		return String.format("%d * %d = %d", x, y, x * y);
	}
}
