package org.example.dao;

import org.example.model.Task;
import org.example.model.User;

import java.util.List;

public interface UserDAO {

    public boolean addUser(User user);

    public List<User> getAllUser();


    public boolean deleteUserTask(Long UserId);

}
