package com.example.Helpdeskapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Tickets")
@Data
public class TicketModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String subject;
        private String requester;
        private String priority;

        private String status;


        private String category;


    public TicketModel() {
    }








}
