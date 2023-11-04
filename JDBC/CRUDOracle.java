import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class CRUDOracle {
    public static void main(String args[])throws IOException{
        Connection cn = null;
        Statement st =  null;                      //Create a table insert to data
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            
            st = cn.createStatement();
            st.executeUpdate("Create table r_data(roll number(3),name varchar2(24))");
            System.out.println("Table is Created");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(int i=1; i<=5; i++){
                System.out.println("Enter roll number.");
                int roll = Integer.parseInt(br.readLine());
                System.out.println("Enter your name");
                String name = br.readLine();
                st.executeUpdate("insert into r_data values ('"+roll+"','"+name+"')");
            }
       
        }catch(ClassNotFoundException se){
            System.out.println("Class Not Found");
        } 
        catch(SQLException se){
            se.printStackTrace();
        }

        finally{
            try{
                cn.close();
            }catch(NullPointerException ne){
                System.out.println("First Construct Connection Object.");
            }
            catch(SQLException ss){
                ss.printStackTrace();
            }
        }
    }
}