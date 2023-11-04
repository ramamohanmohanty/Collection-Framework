import java.util.Scanner;
import java.sql.*;
public class Function3 {
    public static void main(String[] args) {
        Connection cn = null;
        CallableStatement cs = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            String query = "{? = call getdbdata(?,?,?)}";
            cs = cn.prepareCall(query);
            cs.setInt(2,num);
            cs.registerOutParameter(1,Types.INTEGER);
            cs.registerOutParameter(3,Types.VARCHAR);
            cs.registerOutParameter(4,Types.VARCHAR);
            cs.execute();
            System.out.println("Name : "+cs.getString(3)+"  Total mark : "+cs.getInt(1)+"   Grade : "+cs.getString(4));

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
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
