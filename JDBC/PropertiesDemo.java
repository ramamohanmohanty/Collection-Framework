import java.sql.*;
import java.util.*;
import java.io.*;
public class PropertiesDemo {                                                       //error
    public static void main(String[] args) {
        FileInputStream fis = null;
        Connection cn = null;
        Statement  st = null;
        try{
            fis = new FileInputStream("myfile.properties");
            Properties pp = new Properties();
            pp.load(fis);
            String dname = pp.getProperty("my.driver");
            String url =  pp.getProperty("my.url");
            String name =  pp.getProperty("my.username");
            String pass = pp.getProperty("my.password");
            String query = pp.getProperty("my.query");

            Class.forName(dname);
            cn = DriverManager.getConnection("url,name,pass");
            st = cn .createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String name1 = rs.getString(1);
                String pass1 = rs.getString(2);
                System.out.println("User name : "+name1+"    Password : "+pass1);
            }
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }catch(Exception ee){
            ee.printStackTrace();
        }
        finally{
            try{
                cn.close();
                fis.close();
                st.close();
            }catch(Exception xe){
                xe.printStackTrace();
            }
        }
    }
}
