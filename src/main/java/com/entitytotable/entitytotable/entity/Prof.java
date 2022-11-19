package com.entitytotable.entitytotable.entity;

import jakarta.persistence.*;

import java.util.Set;

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

    @OneToMany(mappedBy = "prof")
    Set<Enseigner> enseignerSet;

    public int getProfid() {
        return profid;
    }

    public void setProfid(int profid) {
        this.profid = profid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Set<Enseigner> getEnseignerSet() {
        return enseignerSet;
    }

    public void setEnseignerSet(Set<Enseigner> enseignerSet) {
        this.enseignerSet = enseignerSet;
    }

    @Override
    public String toString() {
        return "Prof{" +
                "profid=" + profid +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", enseignerSet=" + enseignerSet +
                '}';
    }
}
