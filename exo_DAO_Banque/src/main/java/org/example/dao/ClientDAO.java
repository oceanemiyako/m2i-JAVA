package org.example.dao;

import org.example.model.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class ClientDAO extends BaseDAO<Client> {
        public ClientDAO(Connection connection) {
            super(connection);
        }

    @Override
    public boolean save(Client element) throws SQLException {



        return false;
    }

    @Override
    public boolean update(Client element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Client element) throws SQLException {
        return false;
    }

    @Override
    public Client get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Client> get() throws SQLException {
        return null;
    }
}
