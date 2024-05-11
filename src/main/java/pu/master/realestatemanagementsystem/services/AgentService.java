package pu.master.realestatemanagementsystem.services;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pu.master.realestatemanagementsystem.models.entities.Agent;


@Service
public class AgentService
{

    private static final List<Agent> agents = new ArrayList<>();


    static
    {
        agents.add(new Agent("1", "Pesho"));
        agents.add(new Agent("2", "Gosho"));
    }


    public boolean addAgent(final Agent agent)
    {
        return agents.add(agent);
    }


    public List<Agent> getAllAgents()
    {
        return agents;
    }

}
