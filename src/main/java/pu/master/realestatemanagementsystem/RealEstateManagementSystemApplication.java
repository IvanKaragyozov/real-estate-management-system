package pu.master.realestatemanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pu.master.realestatemanagementsystem.endpoints.AgentCLI;


@SpringBootApplication
public class RealEstateManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateManagementSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(final AgentCLI agentCLI) {
		return args -> agentCLI.start();
	}

}
