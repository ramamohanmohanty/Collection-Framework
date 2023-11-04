import java.util.Scanner;
import java.sql.*;
public class ExecuteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sql query");
        String query = sc.nextLine();
        Connection cn = null;
        Statement st = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            st = cn.createStatement(1004,1007);//Scrollable Resultset //Insensitive Resultset //concur read only
            boolean bb = st.execute(query);
            if(bb){
                System.out.println("retrive the data");
                ResultSet rs = st.getResultSet();
                while(rs.next()){
                    int roll =  rs.getInt(1);
                    String name = rs.getString(2);
                    System.out.println("Roll Number is : "+roll+"    Name is : "+name);
                }
            }else{
                System.out.println("Not Select Statement");
            }
        }catch(ClassNotFoundException se){
            System.out.println("Class Not Found");
        }
        catch(SQLException ee){
            ee.printStackTrace();
        }
        finally{
            try{
                cn.close();
                st.close();
            }catch(SQLException ss){
                ss.printStackTrace();
            }
        }
    }
}
