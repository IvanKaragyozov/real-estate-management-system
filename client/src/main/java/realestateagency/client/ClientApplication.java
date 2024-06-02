package realestateagency.client;


import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import realestateagency.client.configurations.SoapClient;
import realestateagency.service.models.GetAgentResponse;


@SpringBootApplication
public class ClientApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ClientApplication.class);
    }


    @Bean
    CommandLineRunner lookup(final SoapClient soapClient)
    {

        return args -> {
            final Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the agent: ");
            final String name = scanner.nextLine();
            scanner.close();

            final GetAgentResponse response = soapClient.getAgent(name);
            if (response != null && response.getAgent() != null)
            {
                System.out.println(response.getAgent());
            }
            else
            {
                System.out.println("Agent with name [" + name + "] not found");
            }
        };
    }
}
