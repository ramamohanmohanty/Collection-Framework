import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
public class JdbcRowSetDemo {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            JdbcRowSet set = RowSetProvider.newFactory().createJdbcRowSet();
            set.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
            set.setUsername("system");
            set.setPassword("system");
            set.setCommand("select * from Login_jt1");
            set.execute();
            while(set.next()){
                System.out.println("User name : "+set.getString(1)+"    Password : "+set.getString(2));
            }
            set.close();
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
}
