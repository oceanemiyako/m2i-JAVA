package org.example.impl;

import org.example.dao.TaskDAO;
import org.example.model.Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class TaskDAOImpl implements TaskDAO {

    private EntityManagerFactory entityManagerFactory; // Important JPA

    public TaskDAOImpl(EntityManagerFactory entityManagerFactory) {  // Constructeur EntityManagerFactory important JPA

        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public boolean addTask(Task task) {  // Ajout d'une tâche
        EntityTransaction transaction = entityManager.getTransaction(); // Fait une transaction avec l'entity
        try {
            transaction.begin(); //Mais une liaison base de donner
            entityManager.persist(task); // Inscrit
            transaction.commit();     //Validation
            return true;
        }catch (Exception e){  //Hérite d'une exception
            if(transaction.isActive()){   // Retour Boolen : si elle est active
                transaction.rollback(); //  Reviens sur la base de donnée
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close(); // Fermeture de l'EntityManager
        }
    }  EntityManager entityManager = entityManagerFactory.createEntityManager(); //Création d'une Entity


    @Override
    public List<Task> getAllTasks() { // Afficher une tâche
        EntityManager entityManager = entityManagerFactory.createEntityManager();  // On crée
        List<Task> tasks = entityManager.createQuery("SELECT t FROM Task t",Task.class).getResultList(); // On récupere , on fait la requête
        entityManager.close(); // On ferme
        return tasks;
    }

    @Override
    public boolean deleteTask(Long taskId) { // Supprimer une tâche
        EntityManager entityManager = entityManagerFactory.createEntityManager(); // On crée
        EntityTransaction transaction = entityManager.getTransaction(); // On va chercher une transaction
        try {
            transaction.begin();
            Task task = entityManager.find(Task.class,taskId); // On va chercher l'objet de type Task
            if(task != null){ // Si il trouve une task différent de type null
                entityManager.remove(task); // Demande de la supprimer
                transaction.commit(); // Valide et exécute
                return true; // renvoie true
            } else { // sinon
                return false; // faux
            }
        }catch (Exception e){ // Juste une demo pour montrer
            if(transaction.isActive()){ //si tâche active
                transaction.rollback(); //retour a la tâche
            }
            e.printStackTrace();
            return false; //Fin de la demo
        }finally {
            entityManager.close(); // Ferme tout
        }
    }

    @Override
    public boolean markTaskAsCompleted(Long taskId) {  //Marquer une tâche fini
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Task task = entityManager.find(Task.class,taskId);
            if(task != null){
                task.setCompleted(true);
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
