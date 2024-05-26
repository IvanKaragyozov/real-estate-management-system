package pu.master.realestatemanagementsystem.endpoints;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import pu.master.realestatemanagementsystem.models.entities.Agent;
import pu.master.realestatemanagementsystem.models.responses.GetAgentResponse;
import pu.master.realestatemanagementsystem.services.AgentService;


@Endpoint
public class AgentEndpoints
{

    private final AgentService agentService;


    @Autowired
    public AgentEndpoints(final AgentService agentService)
    {
        this.agentService = agentService;
    }

    @PayloadRoot(namespace = "http://spring.io/guides/gs-producing-web-service", localPart = "getAgentRequest")
    public GetAgentResponse getAgentRequest()
    {
        final GetAgentResponse getAgentResponse = new GetAgentResponse();
        final Agent agentByName = this.agentService.getAgentByName();
        getAgentResponse.setAgent(agentByName);
    }
}
