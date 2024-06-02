package realestateagency.client;


import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import realestateagency.client.configurations.SoapClient;
import realestateagency.client.presenters.AgentPresenter;
import realestateagency.service.models.GetAgentResponse;


@SpringBootApplication
public class ClientApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ClientApplication.class);
    }



}
