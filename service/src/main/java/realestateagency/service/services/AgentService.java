package realestateagency.service.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import realestateagency.service.models.Agent;
import realestateagency.service.repositories.AgentRepository;


@Service
public class AgentService
{

    private final AgentRepository agentRepository;


    @Autowired
    public AgentService(final AgentRepository agentRepository)
    {
        this.agentRepository = agentRepository;
    }


    public Agent getAgentByName(final String name)
    {
        return this.agentRepository.getAgents().get(name);
    }


    public List<Agent> getAllAgents()
    {
        return this.agentRepository.getAgents().values().stream().toList();
    }
}
