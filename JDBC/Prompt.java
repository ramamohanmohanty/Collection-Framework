import java.sql.*;
import java.util.Scanner;
public class Prompt {
    public static void main(String[] args) {
        Connection cn = null;
        Statement st  = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            System.out.println("\nConnected to Oracle Database!");
            st = cn.createStatement();
            Scanner sc = new Scanner(System.in);

            while(true){
                System.out.println("SQL:>>");
                String query = sc.nextLine();
                boolean bb = st.execute(query);
                
                if(bb == true){
                    ResultSet rs = st.getResultSet();
                    while(rs.next()){
                        int roll = rs.getInt(1);
                        String name= rs.getString(2);
                        System.out.println("Roll : "+roll+"     Name : "+name);
                    }
                }else{
                    int k = st.getUpdateCount();
                    System.out.println(k+"  Time Table Content is Updated");
                }
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
                st.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
