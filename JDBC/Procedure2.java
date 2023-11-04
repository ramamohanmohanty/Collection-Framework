import java.sql.*;
import java.util.Scanner;
public class Procedure2 {
    public static void main(String[] args) {
        Connection cn = null;
        CallableStatement cs = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number");
        int num3 = sc.nextInt();

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            String query = "{call jks_second(?,?,?,?)}";
            cs = cn.prepareCall(query);
            cs.setInt(1, num1);
            cs.setInt(2,num2);
            cs.setInt(3, num3);
            cs.registerOutParameter(4,Types.INTEGER);
            cs.execute();
            int result = cs.getInt(4);
            System.out.println("Biggest number is : "+result);
        
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
