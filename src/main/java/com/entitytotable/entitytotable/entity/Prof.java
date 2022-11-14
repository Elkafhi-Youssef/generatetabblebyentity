package com.entitytotable.entitytotable.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Prof {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "profid")
    private int profid;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    private String prenom;

}
