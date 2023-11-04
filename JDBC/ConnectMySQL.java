import java.util.Collections;
import  java.sql.*;
public class ConnectMySQL {
    public static void main(String args[]){
     
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ram_jt","root","root");

            if(cn == null){
                System.out.println("No object is Construted for Connection Interface");
            }else{
                System.out.println("Connection Object is Constructed.");
            }
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found.");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        finally{
            try{
                cn.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
