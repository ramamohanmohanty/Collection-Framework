import java.sql.*;
import java.io.*;
import java.text.*;
public class DateInsert {
    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement ps  = null;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your id");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter your name");
            String name = br.readLine();
            System.out.println("Enter Date of Birth");
            String dob = br.readLine();
            System.out.println("Enter Date Of Joining");
            String doj = br.readLine();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            java.util.Date udob = sdf.parse(dob);
            Date sdob = new java.sql.Date(udob.getTime());
            java.util.Date udoj = sdf.parse(doj);
            Date sdoj = new java.sql.Date(udoj.getTime());

            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            ps = cn.prepareStatement("insert into r_text3 values(?,?,?,?)");
            ps.setInt(1,id);
            ps.setString(2, name);
            ps.setDate(3, sdob);
            ps.setDate(4,sdoj);
            ps.executeUpdate();
            System.out.println("A row is inserted in the table");
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
                ps.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }   
}
