import oracle.jdbc.*;
import java.util.*;
import java.sql.*;
public class Cursor1 {
    public static void main(String[] args) {
        Connection cn = null;
        CallableStatement cs = null;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first character of employee name");
            String cond = sc.next();
            cond = cond+"%";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            cs = cn.prepareCall("{call find_jksemp(?,?)}");
            cs.setString(1, cond);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet)cs.getObject(2);
            while(rs.next()){
                System.out.println("ID : "+rs.getInt(1)+"   Name : "+rs.getString(2)+"  Salary : "+rs.getDouble(3)+"    Job : "+rs.getString(4));
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
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
