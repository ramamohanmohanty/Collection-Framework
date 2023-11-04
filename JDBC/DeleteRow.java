import java.sql.*;
import java.io.*;
public class DeleteRow {
    public static void main(String[] args) throws IOException {
        Connection cn = null;
        Statement st = null;
        //BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));       
        //System.out.println("Enter your name delete from table");
        //String s = br.readLine();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            st = cn.createStatement();
            //st = cn.createStatement(1005,1008);
            ResultSet rs = st.executeQuery("Select * from r_data");
            while(rs.next()){
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("Roll is : "+roll+ "   name is : "+name);
               /*  if(name.equals(s)){
                    rs.deleteRow();
                    System.out.println("Row are Deleted");
                }*/
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
                st.close();
            }catch(Exception xx){
                xx.printStackTrace();
            }
        }
    }
}