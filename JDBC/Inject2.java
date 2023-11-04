import java.sql.*;                                      //This program is use to PreparedStatement interface
import java.io.*;
public class Inject2 {
    public static void main(String[] args)throws IOException{
        Connection cn = null;
        PreparedStatement ps = null;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your User name");
            String username = br.readLine();
            System.out.println("Enter your Password");
            String password = br.readLine();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            ps =  cn.prepareStatement("select * from Login_jt1 where username=(?) and password=(?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("U Are An Authorised User.");
            }else{
                System.out.println("U Are Not Authorised User.");
            }
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        finally {
            try{
                cn.close();
                ps.close();
            }catch(SQLException ee){
                ee.printStackTrace();
            }
        }
    }
}
