//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.02 at 01:12:40 PM EEST 
//


package realestateagency.service.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@XmlRootElement(namespace = "http://real-estate-agency", name = "getAgentRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetAgentRequest
{
    @XmlElement(namespace = "http://real-estate-agency")
    private String name;

}
