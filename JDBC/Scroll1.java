import java.sql.*;
public class Scroll1 {
    public static void main(String[] args) {
        Connection cn = null;
        Statement st = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            st = cn.createStatement(1004,1007);
            //Resultset is Scrollable insensitive ResultSet Concur is read Only
            ResultSet rs = st.executeQuery("select * from r_data");
            int row = rs.getRow();//0
            System.out.println("Current position of the cursor is : "+row);
            rs.absolute(3);
            row = rs.getRow();//3
            System.out.println("Current position of the cursor is : "+row);
            System.out.println("Roll Number is : "+rs.getInt(1)+"    Name is : "+rs.getString(2));

            rs.absolute(-3);
            row = rs.getRow();//7
            System.out.println("Current position of the cursor is : "+row);
            System.out.println("Roll number is : "+rs.getInt(1)+"       Name is : "+rs.getString(2));

            rs.relative(-3);
            row = rs.getRow(); //4
            System.out.println("Current position of the cursor is : "+row);
            System.out.println("Roll Number is : "+rs.getInt(1)+"      Name is : "+rs.getString(2));

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
        }
    }
}
