import java.io.*;
import java.sql.*;

public class Insert {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PreparedStatement ps = null;
        Connection cn = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
            ps = cn.prepareStatement("INSERT INTO r_data VALUES(?,?)");
            for (int i = 0; i <= 2; i++) {
                System.out.println("Enter Your Roll Number : ");
                int roll = Integer.parseInt("br.readLine");
                System.out.println("Enter Your Name : ");
                String name = br.readLine();

                ps.setInt(1, roll);
                ps.setString(2, name);
                ps.executeUpdate();
            }
            System.out.println("Row Are Inserted");
        } catch (ClassNotFoundException ce) {
            System.out.println("Class Not Found");
        } catch (SQLException ee) {
            ee.printStackTrace();
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