import java.sql.*;
import java.io.*;
public class RetriveDucoment {
    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement ps = null;
        BufferedReader  br = null;
        FileWriter fw = null;
        Reader rr = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your Employee number");
            int number = Integer.parseInt(br.readLine());
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            ps = cn.prepareStatement("select profile from rr_text2 where empno=(?)");
            ps.setInt(1, number);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                rr = rs.getCharacterStream(1);
                fw = new FileWriter("C:/Ram/tt1.txt");
                int ch = 0;
                while((ch = rr.read())!=-1){
                    fw.write(ch);
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
                fw.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
