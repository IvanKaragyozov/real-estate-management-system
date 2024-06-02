package realestateagency.service.repositories;


import java.util.HashMap;
import java.util.Map;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import realestateagency.service.models.Agent;


@Repository
public class AgentRepository
{

    private final Map<String, Agent> agents = new HashMap<>();


    @PostConstruct
    public void populateData()
    {
        agents.put("Tony", new Agent(1, "Tony", 18, "+359 08569102"));
        agents.put("Georgy", new Agent(2, "Georgy", 29, "0898 12 972"));
        agents.put("Emil", new Agent(3, "Emil", 32, "+359 089934045"));
        agents.put("Mariya", new Agent(4, "Mariya", 24, "0888404501"));
        agents.put("Pesho", new Agent(5, "Pesho", 21, "0885116521"));
    }


    public Map<String, Agent> getAgents()
    {
        return agents;
    }
}
