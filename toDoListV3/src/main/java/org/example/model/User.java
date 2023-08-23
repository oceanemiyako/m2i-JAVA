package org.example.model;
/*
Exercice 3 :

On souhaite rajouter des utilisateurs à notre programme TodoList.
Un utilisateur est défini par un nom.
Un utilisateur peut avoir plusieurs taches et une tache ne peut etre attribuer qu'a un seul utilisateur.

Dans le menu princial de l'application on doit pouvoir :
- Ajouter un utilisateur
- Afficher toutes les taches d'un utilisateur
- Supprimer un utilisateur et toutes ses tâches
 */
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {

    @Id
    private int id;

   @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> task;

    private String name;


    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", task=" + task +
                '}';
    }
}
