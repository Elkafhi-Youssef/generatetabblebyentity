package com.entitytotable.entitytotable.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Matiere {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "matiereid")
    private  int matiereid;
    @Basic
    @Column(name = "designation")
    private String designation;

}
