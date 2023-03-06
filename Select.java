import java.net.SocketTimeoutException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
    public static void main(String[] args) {
        try {
            // java provided jdbc api used by d/d vendors
            // diffrent diffrent jars are made by d/d vendors like here Mysql provided this
            // jar
            Class.forName("com.mysql.cj.jdbc.Driver");
            // this line will load the Driver class in the memory

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employees", "root", "Deven@123");
            // This line will create a connection b/w java application and database
            PreparedStatement ps = con.prepareStatement("select * from registeremp");
            // this line prepare whatever u demand and put inside ps variable
            ResultSet rs = ps.executeQuery();
            // the result of the statement got saved inside this Resultset variable which
            // contains all rows of the table

            while (rs.next()) {// iterate on every row one by one
                String name = rs.getString("Names");
                System.out.println(name);

            }
            rs.close();
            ps.close();
            con.close();// closing connection is important

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}