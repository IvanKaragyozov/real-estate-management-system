package pu.master.realestatemanagementsystem.repositories;


import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import pu.master.realestatemanagementsystem.models.entities.Agent;


@Repository
public class AgentRepository
{

    private final Map<String, Agent> agents = new HashMap<>();

    @PostConstruct
    public void populateData()
    {
        agents.put("Tony", new Agent(1, "Tony"));
        agents.put("Georgy", new Agent(2, "Georgy"));
        agents.put("Emil", new Agent(3, "Emil"));
        agents.put("Mariya", new Agent(4, "Mariya"));
        agents.put("Pesho", new Agent(5, "Pesho"));
    }

    public Map<String, Agent> getAgents()
    {
        return agents;
    }
}
