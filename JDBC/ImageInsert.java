import java.sql.PreparedStatement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class ImageInsert {
    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement ps = null;
        BufferedReader br =  null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your id");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter your name");
            String name = br.readLine();
            System.out.println("Enter the path of photo");
            String path = br.readLine();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            ps = cn.prepareStatement("insert into rr_text values(?,?,?)");
            File ff = new File(path);
            FileInputStream fis = new FileInputStream(ff);
            int size = (int) ff.length();
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setBinaryStream(3,fis,size);
            ps.executeUpdate();
            System.out.println("Row is inserted");
        }catch(ClassNotFoundException se){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
        finally {
            try{
                cn.close();
                ps.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
