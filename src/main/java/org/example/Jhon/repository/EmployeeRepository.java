package org.example.Jhon.repository;

import org.example.Jhon.model.Employee;
import org.example.Jhon.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EmployeeRepository implements Repository<Employee>{
    private Connection getConnection() throws SQLException {
        return DatabaseConnection.getInstance();
    }
    @Override
    public List<Employee> findAll() throws SQLException {
        try(Statement myStamt=getConnection().createStatement();
            ResultSet myRes=myStamt.executeQuery("select * from employees")){
            while (myRes.next()){
                Employee e=new Employee();
                e.setId(myRes.getInt("id"));
                e.setFirst_name(myRes.getString("first_name"));
                e.setPa_surname(myRes.getString("pa_surname"));
                e.setMa_surname(myRes.getString("ma_surname"));
                e.setEmail(myRes.getString("email"));
                e.setSalary(myRes.getFloat("salary"));
                employees.add(e);
            }
        }
    }

    @Override
    public Employee getById(Integer id) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(Integer id) {

    }
}
