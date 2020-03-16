    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.Component;
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
public class ClientsCrudSystem {
    
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
    
    public static int save(Clients clt)
    {
        int st = 0;
        try
        {
            String req = "INSERT INTO clients(ncin, fname, lname, tel , adr)VALUES(?,?,?,?,?)";
            Connection con = ClientsCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            preparedStatement.setInt(1, clt.getNcin());
            preparedStatement.setString(2, clt.getFname());
            preparedStatement.setString(3, clt.getLname());
            preparedStatement.setInt(4, clt.getTel());
            preparedStatement.setString(5, clt.getAdr());
            
            st = preparedStatement.executeUpdate();
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return st;
    }


    public static int update(Clients clt) 
    {
        int st = 0;
        try
        {
            String req = "UPDATE clients SET fname=?,lname=?,tel=?,adr=? WHERE ncin=?";
            Connection con = ClientsCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            preparedStatement.setString(1, clt.getFname());
            preparedStatement.setString(2, clt.getLname());
            preparedStatement.setInt(3, clt.getTel());
            preparedStatement.setString(4, clt.getAdr());
            
            st = preparedStatement.executeUpdate();
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return st;
    }
    
    
    public static int delete(int ncin)
    {
        int st = 0;
        
        try
        {
            String req = "DELETE FROM clients WHERE ncin=?";
            Connection con = ClientsCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            
            preparedStatement.setInt(1, ncin);
            
            st = preparedStatement.executeUpdate();
            con.close();
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return st;
    }
    
    
    public static Clients getClient(int ncin)
    {
        Clients client = new Clients();
        try
        {
            String req = "SELECT * FROM clients WHERE ncin=?";
            Connection con = ClientsCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            
            preparedStatement.setInt(1, ncin);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next())
            {
                client.setNcin(resultSet.getInt(1));
                client.setFname(resultSet.getString(2));
                client.setLname(resultSet.getString(3));
                client.setTel(resultSet.getInt(4));
                client.setAdr(resultSet.getString(5));
            }
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return client;
        
    }
    
    
    public static List<Clients> getAllClients()
    {
        List<Clients> list = new ArrayList<Clients>();
        try
        {
            String req = "SELECT * FROM clients";
            Connection con = ClientsCrudSystem.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareCall(req);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
                list.add(new Clients(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getString(5)));
                
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
