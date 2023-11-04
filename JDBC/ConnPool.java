import java.sql.*;
import javax.sql.*;
import oracle.jdbc.pool.*;

public class ConnPool {
    public static void main(String[] args) {
        try{
            OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
            ds.setDriverType("thin");
            ds.setServerName("localhost");
            ds.setPortNumber(1521);
            ds.setServiceName("XE");
            ds.setUser("system");
            ds.setPassword("system");
            PooledConnection pcon = ds.getPooledConnection();
            Connection cn  = pcon.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from Login_jt1");
            while(rs.next()){
                String user = rs.getString(1);
                String pass = rs.getString(2);
                System.out.println("User name is : "+user+"     Password : "+pass);
            }

            cn.close();
            st.close();
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
}
