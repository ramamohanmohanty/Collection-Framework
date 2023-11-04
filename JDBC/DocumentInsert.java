import java.sql.*;
import java.io.*;
public class DocumentInsert {
    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement ps = null;
        BufferedReader br = null;
        FileReader fr = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your number");
            int number = Integer.parseInt(br.readLine());
            System.out.println("Enter Your path of document");
            String path = br.readLine();

            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            
            ps = cn.prepareStatement("insert into rr_text2 values(?,?)");
            File ff = new File(path);
            fr = new FileReader(ff);
            int size = (int)ff.length();
            ps.setInt(1, number);
            ps.setCharacterStream(2,fr,size);
            ps.executeUpdate();
            System.out.println("Row are inserted");

        }catch(ClassNotFoundException se){
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
                fr.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
