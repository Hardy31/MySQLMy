import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMySQL {


    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/myTestDB?useSSL=false","admin@localhost","12345");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from jc_street;");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}



        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con2=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/myTestDB?useSSL=false","admin2@%","54321");
//here sonoo is database name, root is username and password
            Statement stmt=con2.createStatement();
            ResultSet rs=stmt.executeQuery("select * from jc_street ;");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            con2.close();
        }catch(Exception e){ System.out.println(e);}
    }


}
