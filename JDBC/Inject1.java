import java.sql.*;
import java.io.*;                               //injection sql program for use in statement interface
public class Inject1 {
    public static void main(String[] args)throws IOException{
        Connection cn = null;
        Statement st = null;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your User name");
            String username = br.readLine();
            System.out.println("Enter your Password");
            String password = br.readLine();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            st =  cn.createStatement();
            ResultSet rs = st.executeQuery("select * from Login_jt1 where username='"+username+"'  and password='"+password+"'");
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
                st.close();
            }catch(SQLException ee){
                ee.printStackTrace();
            }
        }
    }
}
