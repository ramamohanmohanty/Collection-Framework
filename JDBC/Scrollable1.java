import java.sql.*;
public class Scrollable1 {
    public static void main(String[] args) throws SQLException {
        Connection cn = null;
        Statement st  = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "system");
            //resultset is Scrollable //Insensitive type of resultset // Concur  is read only
            st = cn.createStatement(1004,1007);
            ResultSet rs = st.executeQuery("select * from r_data");
            System.out.println("\nTraverse the element in forword direction");
            while(rs.next()){
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("Roll Number is : "+roll+"    Name is : "+name);
            } 
            System.out.println("\nTraverse the element is backword direction.");
            rs.afterLast();
            while(rs.previous()){
                int r = rs.getInt(1);
                String s = rs.getString(2);
                System.out.println("Roll Number is : "+r+"  Name is : "+s);
            }
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(NullPointerException ne){
            System.out.println("Construct the Object");
        }
        finally{
            try{
                cn.close();
                st.close();
            }catch(SQLException ee){
                ee.printStackTrace();
            }
        }
    }
}
