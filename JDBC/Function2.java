import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        Connection cn = null;
        CallableStatement cs = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            String query = "{? = call jks_arms(?)}";
            cs = cn.prepareCall(query);
            cs.setInt(2,num);
            cs.registerOutParameter(1,Types.VARCHAR);
            cs.execute();
            String result = cs.getString(1);
            System.out.println(num+" : "+result);

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
