/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;

import clients.Client;
import clients.ClientCrudSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

/**
 *
 * @author Med Amine Ben Ammar
 */
public class RentCrudSystem {
    
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
     
     
     public static int save(Rent rent)
    {
        int st = 0;
        try
        {
            String req = "INSERT INTO rent(ncin, id, date, nbd , pd)VALUES(?,?,?,?,?)";
            Connection con = RentCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            preparedStatement.setInt(1, rent.getNcin());
            preparedStatement.setInt(2, rent.getId());
            preparedStatement.setString(3, rent.getDate());
            preparedStatement.setInt(4, rent.getNbd());
            preparedStatement.setInt(5, rent.getPd());
            
            st = preparedStatement.executeUpdate();
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return st;
    }
     
     
    public static int update(Rent rent) 
    {
        int st = 0;
        try
        {
            String req = "UPDATE rent SET date=?,nbd=?,pd=? WHERE ncin=? and id=?";
            Connection con = RentCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            preparedStatement.setString(1, rent.getDate());
            preparedStatement.setInt(2, rent.getNbd());
            preparedStatement.setInt(3, rent.getPd());
            
            preparedStatement.setInt(4, rent.getNcin());
            preparedStatement.setInt(5, rent.getId());
            
            st = preparedStatement.executeUpdate();
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return st;
    }
    
    
    public static int delete(int ncin, int id, String date)
    {
        int st = 0;
        
        try
        {
            String req = "DELETE FROM rent WHERE ncin=? and id=? and date=?";
            Connection con = RentCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            
            preparedStatement.setInt(1, ncin);
            preparedStatement.setInt(2, id);
            preparedStatement.setString(3, date);
            
            st = preparedStatement.executeUpdate();
            con.close();
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return st;
    }
    
    
    public static Rent getRent(int ncin, int id, String date)
    {
        Rent rent = new Rent();
        try
        {
            String req = "SELECT * FROM rent WHERE ncin=? and id=? and date=?";
            Connection con = RentCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            
            preparedStatement.setInt(1, ncin);
            preparedStatement.setInt(2, id);
            preparedStatement.setString(3, date);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next())
            {
                rent.setNcin(resultSet.getInt(1));
                rent.setId(resultSet.getInt(2));
                rent.setDate(resultSet.getString(3));
                rent.setNbd(resultSet.getInt(4));
                rent.setPd(resultSet.getInt(5));
            }
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return rent;
        
    }
    
    
    public static List<Rent> getAllRents()
    {
        List<Rent> list = new ArrayList<Rent>();
        try
        {
            String req = "SELECT * FROM rent";
            Connection con = RentCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
                list.add(new Rent(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getInt(5)));
                
            }
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return list;
    }
    
    
    public static List<Rent> getAllRentsByDate(String date)
    {
        List<Rent> list = new ArrayList<Rent>();
        try
        {
            String req = "SELECT * FROM rent WHERE date=?";
            Connection con = RentCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            preparedStatement.setString(1, date);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
                list.add(new Rent(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getInt(5)));
                
            }
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return list;
    }
    
    
    public static List<Rent> getAllRentsByNcin(int ncin)
    {
        List<Rent> list = new ArrayList<Rent>();
        try
        {
            String req = "SELECT * FROM rent WHERE ncin=?";
            Connection con = RentCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            preparedStatement.setInt(1, ncin);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
                list.add(new Rent(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getInt(5)));
                
            }
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return list;
    }
    
    
    public static List<Rent> getAllRentsByID(int id)
    {
        List<Rent> list = new ArrayList<Rent>();
        try
        {
            String req = "SELECT * FROM rent WHERE id=?";
            Connection con = RentCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            preparedStatement.setInt(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
                list.add(new Rent(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getInt(5)));
                
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
