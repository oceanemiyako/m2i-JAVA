package org.example.service;

import org.example.entity.TodoList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TodolistService {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo_postgres");


    public static void Save() {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        TodoList person = new TodoList("Garcia",true);
        System.out.println("ID de la personne avant persist : "+person.getId());
        em.persist(person);
        System.out.println("ID de la personne aprés persist : "+person.getId());
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static void GetAll(){
        EntityManager em = emf.createEntityManager();

        TodoList todoList = em.find(TodoList.class, 1L);
        System.out.println(todoList.toString());
        em.close();
        emf.close();
    }

    public static void remove(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        TodoList todoList = em.find(TodoList.class, 1L);
        em.remove(todoList);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void modif(){
        EntityManager em = emf.createEntityManager();


    }
}
