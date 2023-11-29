package org.example.Jhon.main;

import org.example.Jhon.model.Employee;
import org.example.Jhon.repository.EmployeeRepository;
import org.example.Jhon.repository.Repository;
import org.example.Jhon.util.DatabaseConnection;
import org.example.Jhon.view.SwingApp;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) throws SQLException {



        // aca ya implemento el try with resources , esto me permite un autoclose de las estancias de conexion

//        try(Connection myConn= DatabaseConnection.getInstance()){
            //este es el listar con POO de los empleados
//            Repository<Employee> repository=new EmployeeRepository();
//            System.out.println("-------------Listando--------------");
//            repository.findAll().forEach(System.out::println);


            //este es el listar por id de empleado
//            System.out.println(repository.getById(3));

            //Insertar employee utiliza el metodo save
//            System.out.println("-------------Insertando un empleado-----------");
//            Employee employee=new Employee();
//            employee.setFirst_name("jhon");
//            employee.setPa_surname("pabon");
//            employee.setMa_surname("gamas");
//            employee.setEmail("pabongamas@gmail.com");
//            employee.setSalary((float)4120000);
//            repository.save(employee);

//            System.out.println("-------------Nuevo empleado insertado-----------");
//            repository.findAll().forEach(System.out::println);


//            System.out.println("--------actualizando------------");
//            Employee employeeActualizar=new Employee();
//            employeeActualizar.setId(6);
//            employeeActualizar.setFirst_name("jhon jairo ");
//            employeeActualizar.setPa_surname("pabon editado");
//            employeeActualizar.setMa_surname("gamas editado");
//            employeeActualizar.setEmail("emaileditad@gmail.com");
//            employeeActualizar.setSalary((float) 12121);
//
//            repository.save(employeeActualizar);

//            System.out.println("-----------Emplado eliminado-----------");
//            repository.delete(15);






//            Statement myStamtNormal=myConn.createStatement();
//            ResultSet myRes=myStamtNormal.executeQuery("SELECT * FROM employees order by pa_surname");) {

//            esto se hacia normal pero sin el try with resoruces
//            //1. conexion a nuestra base de datos
//            myConn= DriverManager.getConnection(url,user,password);
//            System.out.println("Genial Nos conectamos");
//
//            //2.Crea una declaracion objeto
//            myStamtNormal=myConn.createStatement();
//            //3.Ejecutar consulta SQL
//            myRes=myStamtNormal.executeQuery("SELECT * FROM employees order by pa_surname");
//
//            while(myRes.next()){
//                System.out.println(myRes.getString("first_name")+","+myRes.getString("email"));
//            }
//        }
//    }

    //UPDATE CON NUEVO CAMPO
    //alter table employees ADD COLUMN curp VARCHAR(18) NULL AFTER salary,ADD UNIQUE INDEX `curp_UNIQUE` (`curp`ASC) VISIBLE;
    public static void main(String[] args) {
        SwingApp app = new SwingApp();
        app.setVisible(true);
    }
}