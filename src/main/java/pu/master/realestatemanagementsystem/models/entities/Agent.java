package pu.master.realestatemanagementsystem.models.entities;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


/**
 * <p>Java class for agent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="agent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent", propOrder = {"id", "name", "age", "phoneNumber"})
public class Agent {


    protected int id;

    @XmlElement(required = true)
    protected String name;

    @XmlElement(required = true)
    protected int age;

    @XmlElement(required = true)
    protected String phoneNumber;


}