package org.example.dao;

import org.example.model.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ClientDAO extends BaseDAO<Client> {
        public ClientDAO(Connection connection) {
            super(connection);
        }

    @Override
    public boolean save(Client element) throws SQLException {
        request = "INSERT INTO client (first_name, last_name, numberPhone) VALUES (?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirst_name());
        statement.setString(2, element.getLast_name());
        statement.setString(3,element.getNumberPhone());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }


    @Override
    public boolean update(Client element) throws SQLException {
        request = "UPDATE client first_name = ? last_name = ? where id = ?";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirst_name());
        statement.setString(2, element.getLast_name());
        statement.setInt(3, element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(Client element) throws SQLException {
        request = "DELETE from client  where id = ";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

     //TODO FINIR LA METHODE AFFICHER LE SOLDE
    @Override
    public List<Client> get() throws SQLException {
        List<Client> result = new ArrayList<>();
        request = "select pay from compte";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();

        return result;
    }




}
