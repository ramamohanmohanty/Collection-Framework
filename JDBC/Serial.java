import java.io.*;
import java.sql.*;
class Stud implements Serializable {
    String name;
    int roll;
    double fee;
    public Stud(){
        System.out.println("Serialized Object is Construted");
    }
    public void setData(int roll, String name, double fee){
        this.name = name;
        this.roll = roll;
        this.fee = fee;
    }
}
public class Serial {
    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement ps = null;
        try{
            Stud ss = new Stud();
            ss.setData(104, "Rudra", 20599.00);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            ps = cn.prepareStatement("insert into empdemo values(?)");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(ss);
            byte input[] = bos.toByteArray();
            ps.setBytes(1,input);
            ps.executeUpdate();
            System.out.println("Store Serialized object in the table.");      

        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception ie){
            ie.printStackTrace();
        }
        finally{
            try{
                cn.close();
                ps.close();
            }catch(SQLException see){

                see.printStackTrace( );
            }
        }
    }
}