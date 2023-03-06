import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValues {
    public static void main(String[] args) {
        String name = "davinder";
        String pNumber = "8289020879";
        String email = "davindertwal@gmail.com";
        String gender = "M";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "Deven@123");

            PreparedStatement ps = con.prepareStatement("insert into registeremp values(?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, pNumber);
            ps.setString(3, email);
            ps.setString(4, gender);
            int v = ps.executeUpdate();
            if (v > 0) {
                System.out.println("Successfully");
            } else {
                System.out.println("Error");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
