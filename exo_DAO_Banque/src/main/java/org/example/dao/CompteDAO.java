package org.example.dao;

import org.example.model.CompteBancaire;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CompteDAO extends BaseDAO<CompteBancaire> {

        public CompteDAO(Connection connection) {
            super(connection);
        }

    @Override
    public boolean save(CompteBancaire element) throws SQLException {

            request = "INSERT INTO compte (customer) VALUES (?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getCustomer());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;

    @Override
    public boolean update(CompteBancaire element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(CompteBancaire element) throws SQLException {
        return false;
    }

    @Override
    public List<CompteBancaire> get() throws SQLException {
        return null;
    }
}
