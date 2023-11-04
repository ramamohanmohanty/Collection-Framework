import java.sql.*;
import java.io.*;
public class CRUDOracle1 {
   public static void main(String[] args) throws IOException {
    Connection cn = null;               
    Statement st = null;                        // Enter the roll number delete this row

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jabc:oracle:thin:@localhost:1521:XE","system","system");
            st = cn.createStatement();
           // st.executeUpdate("create table rr_jt(roll number(3), name varchar2(24))");
            //System.out.println("Table is Created");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(int i=1; i<=3; i++){
                System.out.println("Enter your Roll Number");
                int roll = Integer.parseInt(br.readLine());
                System.out.println("Enter your name");
                String name = br.readLine();
                st.executeUpdate("insert into rr_jt values('"+roll+"''"+name+"')");
            }
            System.out.println("Row are inserted");
            
        }catch(ClassNotFoundException se){
            System.out.println("Class Not Found");
        }
        catch(SQLException ee){
            ee.printStackTrace();
        }
        finally{
            try{
                cn.close();
            }catch(NullPointerException ne){
                System.out.println("First Construct Connnection Object.");
            }
            catch(SQLException uu){
                uu.printStackTrace();
            }
        }
   } 
}
