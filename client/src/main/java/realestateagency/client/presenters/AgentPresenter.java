package realestateagency.client.presenters;


import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import realestateagency.client.configurations.SoapClient;
import realestateagency.service.models.GetAgentResponse;


@Component
public class AgentPresenter
{

    private final SoapClient soapClient;


    public AgentPresenter(final SoapClient soapClient)
    {
        this.soapClient = soapClient;
    }


    @Bean
    public CommandLineRunner lookup(final AgentPresenter agentPresenter)
    {
        return args -> agentPresenter.present();
    }


    private void present()
    {
        final Scanner scanner = new Scanner(System.in);
        String agentName;
        do
        {
            System.out.println("Enter the name of the agent (type 'Exit' to quit): ");
            agentName = scanner.nextLine();
            if (!agentName.equalsIgnoreCase("Exit"))
            {
                final GetAgentResponse response = soapClient.getAgent(agentName);
                if (response != null && response.getAgent() != null)
                {
                    System.out.println(response.getAgent());
                }
                else
                {
                    System.out.printf(String.format("Agent with name [%s] not found", agentName));
                }
            }
        }
        while (!agentName.equalsIgnoreCase("Exit"));

        scanner.close();
        System.out.println("Shutting down...");
        System.exit(0);
    }

}