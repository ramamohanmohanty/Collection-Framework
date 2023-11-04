import java.sql.*;
public class DatabaseMetaDataDemo {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            DatabaseMetaData meta = cn.getMetaData();
            System.out.println("Driver Name is : "+meta.getDriverName());
            System.out.println("Driver version is : "+meta.getDriverVersion());
            System.out.println("Database Software name : "+meta.getDatabaseProductName());
            System.out.println("Database Software Version is : "+meta.getDatabaseProductVersion());
            System.out.println("URL is : "+meta.getURL());
           
            cn.close();
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
}
