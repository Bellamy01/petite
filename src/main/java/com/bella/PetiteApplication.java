package com.bella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PetiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetiteApplication.class, args);
	}

    @GetMapping("/")
    public GreetResponse greet() {
        return new GreetResponse("Hello");
    }

    //private record GreetResponse(String greet) {}

    public static class GreetResponse {
        private final String greet;

        public GreetResponse(String greet) {
            this.greet = greet;
        }

        public String getGreet() {
            return greet;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public String toString() {
            return "Greet Response {" + "greet = '" + greet + "'}";
        }
    }

}
