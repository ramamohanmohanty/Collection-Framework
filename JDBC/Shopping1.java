import java.sql.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom; 

public class Shopping1 {

    public static void main(String[] args) {

        Connection cn = null;
        PreparedStatement ps = null;
        BufferedReader br = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your Shopping Amount");
            double amount = Double.parseDouble(br.readLine());
            System.out.println("Enter Your Card Number");
            int no = Integer.parseInt(br.readLine());
            System.out.println("Enter Your Pin Number");
            int pin = Integer.parseInt(br.readLine());
            System.out.println("Enter Your valid Mobile Number");
            int mobileno = Integer.parseInt(br.readLine());

            int otp = ThreadLocalRandom.current().nextInt(1000, 10000);
            System.out.println("Generated OTP: " + otp);

            cn.setAutoCommit(false);
            ps = cn.prepareStatement("Select balance from user1_info_r where cr_no=(?) and cr_pin=(?) and mobile=(?)");
            ps.setInt(1, no);
            ps.setInt(2, pin);
            ps.setInt(3, mobileno);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                double balance = rs.getDouble(1);

                if (balance >= amount) {
                    ps = cn.prepareStatement("update user1_info_r set balance=(?) where cr_no=(?) cr_pin=(?) and mobile(?)");
                    ps.setDouble(1, balance - amount);
                    ps.setInt(2, pin);
                    ps.setInt(3, no);
                    ps.setInt(4, mobileno);
                    ps.executeUpdate();
                    ps = cn.prepareStatement("update shop1_info_r set balance=balance+? where name='Amazon'");
                    ps.setDouble(1, amount);
                    ps.executeUpdate();
                    System.out.println("Transaction is successfully committed");
                } else {
                    System.out.println("Insufficient amount available in your bank");
                    System.exit(0);
                }
                cn.commit();
            } else {
                System.out.println("Invalid mobile number please input correct mobile number.");
            }

        } catch (Exception ee) { 
            try {
                System.out.println("!!!!Transaction is Rollback.!!!!");
                System.out.println("Input wrong card number or pin number.");

                cn.rollback();
            } catch (Exception xx) {
                xx.printStackTrace();
            }
        } finally {
            try {
                cn.close();
                ps.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
