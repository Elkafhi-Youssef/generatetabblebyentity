package com.entitytotable.entitytotable.entity;

import jakarta.persistence.*;
@Entity
@Table
public class Enseigner {
    @EmbeddedId
    Enseignerkey idenseigner;

    @ManyToOne
    @MapsId("profid")
    @JoinColumn(name = "profid")
    private Prof prof;
    @ManyToOne
    @MapsId("matiereid")
    @JoinColumn(name = "matiereid")
    private Matiere matiere;
    @ManyToOne
    @MapsId("classeid")
    @JoinColumn(name = "classeid")
    private Classe classe;
    @Basic
    @Column(name = "nbrheure")
    private String nbrheure;
}
