import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class Insert2 {
    public static void main(String[] args)throws IOException {
        Connection cn = null;
        PreparedStatement ps = null;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            ps = cn.prepareStatement("insert into r_data values(?,?)");
            for(int i = 1; i<=3; i++){
                System.out.println("Enter roll number");
                int r = Integer.parseInt(br.readLine());
                System.out.println("Enter your name");
                String s = br.readLine();

                ps.setInt(1,r);
                ps.setString(2,s);
                ps.executeUpdate();
            }
            System.out.println("Row are Inserted");
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        finally{
            try{
                cn.close();
                ps.close();
            }catch(SQLException ee){
                ee.printStackTrace();
            }
        }
    }
}