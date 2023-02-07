package fr.akoubayo.proxyvotingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ProxyVotingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyVotingAppApplication.class, args);
	}

}
