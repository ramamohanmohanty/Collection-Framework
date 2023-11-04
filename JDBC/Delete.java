import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) throws IOException {
        Connection cn = null;
        Statement st = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name from your table");
        String n = br.readLine();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            st = cn.createStatement(1005,1008);
            ResultSet rs = st.executeQuery("select * from r_data");
            
            while (rs.next()) {
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                
                if(n.equals(name)){
                    rs.deleteRow();
                    System.out.println("Row are Deleted");
                }
            }

        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        finally{
            try{
                cn.close();
                st.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
