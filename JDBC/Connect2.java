import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Connect2 {
    public static void main(String args[]){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement smt = cn.createStatement();

        System.out.println("Object is Constructed.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(int i=1; i<=5; i++){

                System.out.println("Enter roll number.");
                int roll = Integer.parseInt(br.readLine());

                System.out.println("Enter your name");
                String name = br.readLine();

                System.out.println("Enter Your Address");
                String address = br.readLine();
                smt.executeUpdate("insert into r_data values ('"+roll+"','"+name+"','"+address+"')");

                System.out.println("Table Created Successfully!!!");
            }
        }catch(SQLException se){
            System.out.println("Class Not Found");
        }
        catch(Exception ee){
            ee.printStackTrace();
        }

        
    }
}


