package realestateagency.service.endpoints;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import realestateagency.service.models.Agent;
import realestateagency.service.models.GetAgentRequest;
import realestateagency.service.models.GetAgentResponse;
import realestateagency.service.services.AgentService;


@Endpoint
public class AgentEndpoint
{

    private static final String NAMESPACE = "http://real-estate-agency";

    private final AgentService agentService;


    @Autowired
    public AgentEndpoint(final AgentService agentService)
    {
        this.agentService = agentService;
    }


    @PayloadRoot(namespace = NAMESPACE, localPart = "getAgentRequest")
    @ResponsePayload
    public GetAgentResponse getAgentRequest(@RequestPayload final GetAgentRequest agentRequest)
    {
        final GetAgentResponse getAgentResponse = new GetAgentResponse();

        final Agent agentByName = this.agentService.getAgentByName(agentRequest.getName());
        getAgentResponse.setAgent(agentByName);

        return getAgentResponse;
    }
}
