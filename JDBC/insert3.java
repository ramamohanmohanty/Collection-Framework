import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class insert3{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter our name delete from table");
        String n = br.readLine();
        Connection cn = null;
        Statement st = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            st = cn.createStatement(1005,1008);
            ResultSet rs = st.executeQuery("select roll,name from r_data");

            if(rs.next()){
                rs.deleteRow();
                System.out.println("Row are Deleted");
                //int roll = rs.getInt(1);
                //String  name = rs.getString(2);
               //System.out.println("Roll no : "+roll+"   Name is : "+name);
            }
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception ee){
            ee.printStackTrace();
        }
        finally {
            try{
                cn.close();
                st.close();
            }catch(Exception xx){
                xx.printStackTrace();
            }
        }
    }
}