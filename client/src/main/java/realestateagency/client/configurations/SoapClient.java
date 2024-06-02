package realestateagency.client.configurations;


import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import realestateagency.service.models.GetAgentRequest;
import realestateagency.service.models.GetAgentResponse;


@Component
public class SoapClient extends WebServiceGatewaySupport
{

    public GetAgentResponse getAgent(final String name)
    {
        final GetAgentRequest request = new GetAgentRequest();
        request.setName(name);

        return (GetAgentResponse) getWebServiceTemplate()
                        .marshalSendAndReceive("http://localhost:8091/ws", request,
                                               new SoapActionCallback("http://real-estate-agency/GetAgentRequest"));
    }
}
