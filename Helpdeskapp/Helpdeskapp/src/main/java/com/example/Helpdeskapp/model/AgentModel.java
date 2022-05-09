package com.example.Helpdeskapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Agents")
@Data
public class AgentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Agent_id;
    private String name;
    private String email;


    public AgentModel() {
    }


}
