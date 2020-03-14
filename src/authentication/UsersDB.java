package authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class UsersDB {
    static Connection con = null;
    
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/sglv-db";
            con = DriverManager.getConnection(url,"root","");
            //System.out.println("Connected");
            
        }catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        
        return con;
    }
    
    public static List<Users> getUsers()
    {
        List<Users> list = new ArrayList<Users>();
        try
        {
            String req = "select * from users;";
            Connection con;
            con = UsersDB.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement)con.prepareStatement(req);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            Users user = new Users();
            while(resultSet.next())
                {
                    user.setId(resultSet.getInt(1));  
                    user.setUsername(resultSet.getString(2));
                    user.setPassword(resultSet.getString(3));
                    
                    list.add(user);
                }
            con.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return list;
    }
}
