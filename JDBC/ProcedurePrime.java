import java.sql.*;
import  java.util.Scanner;
public class ProcedurePrime {
    public static void main(String[] args) {

        Connection cn = null;
        CallableStatement cs = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            String query = "{call is_prime(?,?)}";
            cs = cn.prepareCall(query);
            cs.setInt(1, n);
            cs.registerOutParameter(2,Types.INTEGER);
            cs.execute();
            int result = cs.getInt(2);
            if(result == 1){
                System.out.println("This is a Prime Number");
            }else{
                System.out.println("Not a Prime Number");
            }

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
            }catch(SQLException xx){
                xx.printStackTrace();
            }
        }

    }
}
