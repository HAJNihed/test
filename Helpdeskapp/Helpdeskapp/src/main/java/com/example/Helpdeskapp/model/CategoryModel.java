package com.example.Helpdeskapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Categories")
@Data
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;
    private String title;



    public CategoryModel() {
    }




}
