package org.example.dao;

import org.example.model.TaskInfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TaskInfoDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo_postgres");
    EntityManager em = emf.createEntityManager();

    EntityTransaction transac = em.getTransaction();



    public boolean addDescription(TaskInfo taskInfo) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(taskInfo);
            transaction.commit();
            return true;

        }finally {
            entityManager.close();
        }
    }
    private EntityManagerFactory entityManagerFactory;
    EntityManager entityManager = entityManagerFactory.createEntityManager();



    public void addDate(TaskInfo taskInfo) {
return;
    }

}
