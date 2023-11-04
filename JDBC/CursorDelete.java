import java.sql.*;
import java.io.*;
public class CursorDelete {
    public static void main(String[] args) throws SQLException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Your name whom u delete form table.");
            String n = br.readLine();
            Connection cn = null;
            Statement st = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            st = cn.createStatement(1005,1008);
            ResultSet rs = st.executeQuery("Select roll,name from r_data");
            while(rs.next()){
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                if(name.equals(n)){
                    rs.deleteRow();
                    System.out.println("Row is Deleted");
                }
            }
        }catch(ClassNotFoundException ce){
            System.out.println("Class not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        finally{
            try{
                cn.close();
                st.close();
            }catch(NullPointerException ee){
                ee.printStackTrace();
            }
        }
    }
}
