import java.sql.*;
import java.io.*;
public class InsertToDBS {
    public static void main(String[] args) throws SQLException  {
        Connection cn = null;
        PreparedStatement ps = null;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            ps = cn.prepareStatement("insert into Login_jt1 values(?,?)");
            for(int i=0; i<=3; i++){
                System.out.println("Enter your username");
                String s = br.readLine();
                System.out.println("Enter your password");
                String ss = br.readLine();
                ps.setString(1, s);
                ps.setString(2, ss);
                ps.executeUpdate();
            }
            System.out.println("Row are inserted");
        }catch(ClassNotFoundException se){
            System.out.println("Class Not Found");
        }
        catch(IOException ne){
            ne.printStackTrace();
        }
        finally{
            try{
                cn.close();
                ps.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}
