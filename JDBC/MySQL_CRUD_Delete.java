import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class MySQL_CRUD_Delete {
    public static void main(String[] args) throws IOException {
        Connection cn = null;
        PreparedStatement ps = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name to delete from the table");
        String n = br.readLine();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/r_jt", "root", "root");
            ps = cn.prepareStatement("delete from Stud_emp where name=(?)");
            ps.setString(1, n);
            int count = ps.executeUpdate();
            if(count > 0){
                System.out.println("Row are Delete");
            }else{
                System.out.println("Delete failed");
            }
        } catch (ClassNotFoundException ce) {
            System.out.println("Class Not Found");
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                cn.close();
                ps.close();
            } catch (Exception xx) {
                xx.printStackTrace();
            }
        }
    }
}
