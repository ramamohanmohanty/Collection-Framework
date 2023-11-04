import java.sql.*;
import java.util.Scanner;                                           //Factorial Number use backend code SQL oracle database
public class Function1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        Connection cn = null;
        CallableStatement cs = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            String query = "{? = call jks_fact(?)}";
            cs = cn.prepareCall(query);
            cs.setInt(2,num);
            cs.registerOutParameter(1,Types.INTEGER);
            cs.execute();
            int result = cs.getInt(1);
            System.out.println("Factorial of : "+num+"  is : "+result);
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
