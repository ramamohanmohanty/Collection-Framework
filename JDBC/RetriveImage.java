import java.sql.*;
import java.io.*;
public class RetriveImage {
    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement ps = null;
        BufferedReader br =  null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your Employee id");
            int id = Integer.parseInt(br.readLine());
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            ps = cn.prepareStatement("select photo from rr_text where empid=(?)");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                InputStream is = rs.getBinaryStream(1);
                FileOutputStream fos = new FileOutputStream("C:/Ram/kk.jpg");
                int ch = 0;
                while((ch = is.read())!=-1){
                    fos.write(ch);
                }
            }
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
        finally{
            try{
                cn.close();
                ps.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
