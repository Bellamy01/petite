package com.bella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PetiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetiteApplication.class, args);
	}

    @GetMapping("/")
    public GreetJson greet() {
        return new GreetJson("Hello Teachers!",
                new Employee("Gordon", 30, "System Analyst"),
                List.of("Louis Vuitton", "Zoey", "North Face")
        );
    }

    record Employee(String name, int age, String position) {}

    record Languages(List<String> programs) {}

    private record GreetJson(String greet, Employee employee, List<String> languages) {}
}
