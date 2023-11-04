import java.util.*;
import javax.sql.*;
import oracle.jdbc.rowset.*;

public class CacheDemo {
    public static void main(String[] args) {
        try{
            OracleCachedRowSet set = new OracleCachedRowSet();
            set.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
            set.setUsername("system");
            set.setPassword("system");
            set.setCommand("select * from Login_jt1");
            set.execute();
            while(set.next()){
                System.out.println("Name is : "+set.getString(1)+"  Password is : "+set.getString(2));
            }
            set.clone();
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
}
