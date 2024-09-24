
import java.sql.*;

public class Test {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "root");
            System.out.println("Driver Loaded");

            st = con.createStatement();

            String query = "SELECT * FROM Guests";
            rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getString(4) + "\t");
            }
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
