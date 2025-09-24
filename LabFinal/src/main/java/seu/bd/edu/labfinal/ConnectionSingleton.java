package seu.bd.edu.labfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {


    private static Connection connection;
    private   ConnectionSingleton() {};
    public static Connection getConnection(){
        if(connection==null){
            try{
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/seu3","root","rabbi1067");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return  connection;
    }


}
