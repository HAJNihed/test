package com.example.Helpdeskapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Status")
@Data
public class StatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long status_id;
    private String title;


    public StatusModel() {
    }







}

