import java.sql.*;
import java.io.*;
public class Shopping {
    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement ps = null;
        BufferedReader br = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your Shopping Amount");
            double amount = Double.parseDouble(br.readLine());
            System.out.println("Enter Your Card Number");
            int no = Integer.parseInt(br.readLine());
            System.out.println("Enter Your Pin Number");
            int pin = Integer.parseInt(br.readLine());

            cn.setAutoCommit(false);
            ps = cn.prepareStatement("Select balance from user_info_r where c_no=(?) and c_pin=(?)");
            ps.setInt(1,no);
            ps.setInt(2, pin);
            ResultSet rs = ps.executeQuery();
            rs.next();
            double balance = rs.getDouble(1);

            if(balance >= amount){
                ps = cn.prepareStatement("update user_info_r set balance=(?) where c_pin=(?) and c_no=(?)");
                ps.setDouble(1, balance-amount);
                ps.setInt(2, pin);
                ps.setInt(3, no);
                ps.executeUpdate();
                ps = cn.prepareStatement("update shop_info_r set balance=balance+? where name='Pantaloon'");
                ps.setDouble(1, amount);
                ps.executeUpdate();
                System.out.println("Transaction is successfully Commited");
            }else{
                System.out.println("Insufficient amount available in my bank");
                System.exit(0);
            }
            cn.commit();

        }catch(Exception ee){
            try{
                System.out.println("!!!!Transaction is Rollback.!!!!");
                System.out.println("Input wrong card number or pin number.");
                cn.rollback();
            }catch(Exception xx){
                xx.printStackTrace();
            }
        }
        finally{
            try{
                cn.close();
                ps.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}
