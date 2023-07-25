package UniversityManagementSystem;
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn(){
        try{
            //1st step
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2nd step
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "Zavesh14@998003");
            s = c.createStatement();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
