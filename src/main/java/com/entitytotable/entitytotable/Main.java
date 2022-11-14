package com.entitytotable.entitytotable;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main
{
    public static void main(String[] args) {
// SessionFactory in Hibernate 5 example
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        em.close();
        emf.close();
    }
}
