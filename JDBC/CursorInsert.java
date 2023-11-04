import java.sql.*;
public class CursorInsert {
    public static void main(String[] args) {
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
                System.out.println("Roll Number is : "+roll+"   Name is : "+name);
            }
            rs.moveToInsertRow();
            rs.updateInt(1,112);
            rs.updateString(2,"karan Kumar");
            rs.insertRow();
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
            }catch(SQLException ee){
                ee.printStackTrace();
            }
            catch(NullPointerException ne){
                ne.printStackTrace();
            }
        }
    }
}
