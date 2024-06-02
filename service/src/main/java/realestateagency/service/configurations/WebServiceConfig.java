package realestateagency.service.configurations;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;


@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter
{
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(final ApplicationContext applicationContext)
    {
        final MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "real-estate")
    public DefaultWsdl11Definition defaultWsdl11Definition(final XsdSchema agentSchema)
    {
        final DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setSchema(agentSchema);
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setPortTypeName("RealEstateAgencyServicePort");
        wsdl11Definition.setTargetNamespace("http://real-estate-agency");
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema agentSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("real-estate.xsd"));
    }
}
