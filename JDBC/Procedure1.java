import java.sql.*;
import java.util.Scanner;
import java.util.Scanner.*;
public class Procedure1 {
    public static void main(String[] args) {
        Connection cn = null;
        CallableStatement cs = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            String query = "{call jks_first(?,?)}";
            cs = cn.prepareCall(query);
            cs.setInt(1,num);
            cs.registerOutParameter(2, Types.INTEGER);
            cs.execute();
            int result = cs.getInt(2);
            System.out.println("Cube is :  "+num+"  is : "+result);
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        finally{
            try{
                cn.close();
                cs.close();
            }catch(SQLException ee){
                ee.printStackTrace();
            }
        }
    }
}
