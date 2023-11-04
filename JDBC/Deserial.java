import java.sql.*;
import java.io.*;
public class Deserial {
    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement ps = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            ps = cn.prepareStatement("select * from empdemo");
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                byte bb[] = rs.getBytes(1);
                ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bb));
                Stud kk = (Stud)ois.readObject();
                System.out.println("Name is "+kk.name+"  Roll : "+kk.roll+"     Fee : "+kk.fee);
            }
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception ee){
            ee.printStackTrace();
        }
        finally{
            try{
                cn.close();
                ps.close();
            }catch(Exception uu){
                uu.printStackTrace();
            }
        }
    }
}
