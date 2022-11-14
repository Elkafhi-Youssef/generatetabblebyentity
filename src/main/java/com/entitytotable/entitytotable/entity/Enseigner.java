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
    Prof prof;
    @ManyToOne
    @MapsId("matiereid")
    @JoinColumn(name = "matiereid")
    Matiere matiere;
    @ManyToOne
    @MapsId("classeid")
    @JoinColumn(name = "classeid")
    Classe classe;
}
