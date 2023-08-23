package org.example.impl;

import org.example.dao.UserDAO;
import org.example.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class UserIDAOmpl implements UserDAO {

    private EntityManagerFactory entityManagerFactory;

    public UserIDAOmpl(EntityManagerFactory entityManagerFactory) {

        this.entityManagerFactory = entityManagerFactory;
    }


    @Override
    public boolean addUser(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(user);
            transaction.commit();
            return true;
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }    }

    @Override
    public List<User> getAllUser() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<User> User = entityManager.createQuery("SELECT User FROM users ",User.class).getResultList();
        entityManager.close();
        return User;    }



    @Override
    public boolean deleteUserTask(Long UserId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            User user = entityManager.find(User.class,UserId);
            if(user!= null){
                entityManager.remove(user);
                transaction.commit();
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }
}





