package com.entitytotable.entitytotable.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Enseignerkey  implements Serializable {
    @Column(name = "profid")
    private int  profid;

    @Column(name = "matiereid")
    private int  matiereid;

    @Column(name = "classeid")
    private int  classeid;

    public int getProfid() {
        return profid;
    }

    public void setProfid(int profid) {
        this.profid = profid;
    }

    public int getMatiereid() {
        return matiereid;
    }

    public void setMatiereid(int matiereid) {
        this.matiereid = matiereid;
    }

    public int getClasseid() {
        return classeid;
    }

    public void setClasseid(int classeid) {
        this.classeid = classeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enseignerkey that = (Enseignerkey) o;
        return profid == that.profid && matiereid == that.matiereid && classeid == that.classeid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profid, matiereid, classeid);
    }
}
