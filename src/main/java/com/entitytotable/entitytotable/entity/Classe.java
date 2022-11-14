package com.entitytotable.entitytotable.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Classe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "classeid")
    private int classeid;
    @Basic
    @Column(name = "nameclasse")
    private String nameclasse;
    @Basic
    @Column(name = "effectif")
    private  String effectif;
    @Basic
    @Column(name = "department")
    private String department;
}
