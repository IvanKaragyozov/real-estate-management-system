package pu.master.realestatemanagementsystem.models.responses;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import pu.master.realestatemanagementsystem.models.entities.Agent;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agent" type="{http://spring.io/guides/gs-producing-web-service}agent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"agent"})
@XmlRootElement(name = "getAgentResponse")
public class GetAgentResponse {

    @XmlElement(required = true)
    protected Agent agent;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent value) {
        this.agent = value;
    }
}
