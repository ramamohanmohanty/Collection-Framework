import java.sql.*;
import java.io.*;
import java.text.*;
public class DateRetrive {
    public static void main(String[] args) {
        Connection cn = null;
        Statement st = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from r_text3");
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                java.sql.Date sdob = rs.getDate(3);
                java.sql.Date sdoj = rs.getDate(4);

                java.util.Date udob = sdob;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
                String dob = sdf.format(sdob);

                java.util.Date udoj = sdoj;
                String doj = sdf.format(udoj);
                System.out.println("ID : "+id+"     Name : "+name+"    DOB : "+dob+"     DOJ : "+doj);
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
        finally{
            try{
                cn.close();
                st.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
