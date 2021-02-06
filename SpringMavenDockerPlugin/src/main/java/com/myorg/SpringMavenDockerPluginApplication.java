package com.myorg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMavenDockerPluginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMavenDockerPluginApplication.class, args);
	}
	
	@GetMapping("/hi")
	public String getGreetings()
	{
		return "Hi!! Greetings from Maven Docker Plugin";
	}

}
