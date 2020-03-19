/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import clients.Client;
import clients.ClientCrudSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Med Amine Ben Ammar
 */
public class CarCrudSystem {
    
    
    
    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/sglv-db";
                con = DriverManager.getConnection(url,"root","");
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }
    
    
    public static int save(Car car)
    {
        int st = 0;
        try
        {
            String req = "INSERT INTO cars(id, mar)VALUES(?,?)";
            Connection con = CarCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            preparedStatement.setInt(1, car.getId());
            preparedStatement.setString(2, car.getMar());
            
            st = preparedStatement.executeUpdate();
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return st;
    }
    
    
    public static int update(Car car) 
    {
        int st = 0;
        try
        {
            String req = "UPDATE cars SET id=?,mar=? WHERE id=?";
            Connection con = CarCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            preparedStatement.setInt(1, car.getId());
            preparedStatement.setString(2, car.getMar());
            
            preparedStatement.setInt(3, car.getId());
            
            st = preparedStatement.executeUpdate();
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return st;
    }
    
    
    public static int delete(int id)
    {
        int st = 0;
        
        try
        {
            String req = "DELETE FROM cars WHERE id=?";
            Connection con = CarCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            
            preparedStatement.setInt(1, id);
            
            st = preparedStatement.executeUpdate();
            con.close();
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return st;
    }
    
    
    public static Car getCar(int id)
    {
        Car car = new Car();
        try
        {
            String req = "SELECT * FROM cars WHERE id=?";
            Connection con = CarCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next())
            {
                car.setId(resultSet.getInt(1));
                car.setMar(resultSet.getString(2));
            }
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return car;
        
    }
    
    
    public static List<Car> getAllCars()
    {
        List<Car> list = new ArrayList<Car>();
        try
        {
            String req = "SELECT * FROM cars";
            Connection con = ClientCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
                list.add(new Car(resultSet.getInt(1),resultSet.getString(2)));
                
            }
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return list;
    }
}
