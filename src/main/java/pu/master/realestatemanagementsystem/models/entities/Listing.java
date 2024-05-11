package pu.master.realestatemanagementsystem.models.entities;


import lombok.Data;


@Data
public class Listing
{
    private String id;
    private Property property;
    private Agent agent;
}
