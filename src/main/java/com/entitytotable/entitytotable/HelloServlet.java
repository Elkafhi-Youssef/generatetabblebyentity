package com.entitytotable.entitytotable;

import java.io.*;
import java.util.List;

import com.entitytotable.entitytotable.entity.Classe;
import com.entitytotable.entitytotable.entity.Prof;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Prof> query = em.createQuery("SELECT s FROM Prof s", Prof.class);
        List<Prof> profList = query.getResultList();
        for (Prof prof : profList) {
            System.out.println(prof.toString());
        }


        em.close();
        emf.close();
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}