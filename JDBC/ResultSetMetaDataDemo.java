import java.sql.*;
public class ResultSetMetaDataDemo {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from Login_jt1");
            ResultSetMetaData meta = rs.getMetaData();
            for(int i=1; i <= meta.getColumnCount();i++){
                System.out.println(meta.getColumnLabel(i)+"\t\t");
            }
            System.out.println("\n\n************************************\n");
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
            }

            cn.close();
            st.close();
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
}
