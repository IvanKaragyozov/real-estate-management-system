package pu.master.realestatemanagementsystem.endpoints;


import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pu.master.realestatemanagementsystem.models.entities.Agent;
import pu.master.realestatemanagementsystem.services.AgentService;


@Component
public class AgentCLI
{

    private final AgentService agentService;
    private final Scanner scanner = new Scanner(System.in);


    @Autowired
    public AgentCLI(final AgentService agentService)
    {
        this.agentService = agentService;
    }


    public void start()
    {
        while (true)
        {
            System.out.println("Choose an option:");
            System.out.println("1. Add Agent");
            System.out.println("2. List Agents");
            System.out.println("3. Exit");

            final String choice = scanner.nextLine();

            switch (choice)
            {
                case "1":
                    addAgent();
                    break;
                case "2":
                    listAgents();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid choice. Exiting...");
                    System.exit(0);
            }
        }
    }


    private void addAgent()
    {
        System.out.println("Enter agent ID:");
        final String id = scanner.nextLine();

        System.out.println("Enter agent name:");
        final String name = scanner.nextLine();

        final Agent agent = new Agent(id, name);
        boolean success = agentService.addAgent(agent);
        if (success)
        {
            System.out.println("Agent added successfully");
        }
        else
        {
            System.out.println("Failed to add agent");
        }
    }


    private void listAgents()
    {
        System.out.println("List of agents:");
        for (final Agent agent : agentService.getAllAgents())
        {
            System.out.println(agent.getId() + ": " + agent.getName());
        }
    }

}
