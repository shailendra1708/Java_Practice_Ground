import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Update {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            // Load MySQL JDBC Driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            // Establish Connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "root");
            System.out.println("Connection Established");

            // Create Statement
            st = con.createStatement();

            // Define Update query with column names
            String query = "UPDATE Guests SET Phone = '8457824542', Address = 'Near Medicaps' WHERE GuestID = 8";

            // Execute INSERT query
            int i = st.executeUpdate(query);

            // Check if insertion was successful
            if (i > 0) {
                System.out.println(i + " Record Updated...");
            } else {
                System.out.println("Record Updation Failed...");
            }
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}


/*
 
+---------+-----------+----------+----------------------------+-------------+----------------------+---------------+---------+
| GuestID | FirstName | LastName | Email                      | Phone       | Address              | City          | Country |
+---------+-----------+----------+----------------------------+-------------+----------------------+---------------+---------+
|       1 | John      | Doe      | john.doe@example.com       | 1234567890  | 123 Main St          | New York      | USA     |
|       2 | Emily     | Williams | emily.williams@example.com | 9876543210  | 456 Elm St           | Los Angeles   | USA     |
|       3 | Michael   | Brown    | michael.brown@example.com  | 9988776655  | 789 Oak St           | Chicago       | USA     |
|       4 | Sophia    | Davis    | sophia.davis@example.com   | 1122334455  | 101 Pine St          | Miami         | USA     |
|       5 | James     | Miller   | james.miller@example.com   | 1231231234  | 202 Maple St         | San Francisco | USA     |
|       6 | Olivia    | Garcia   | olivia.garcia@example.com  | 3213213210  | 303 Birch St         | Dallas        | USA     |
|       7 | Dinesh    | Sharma   | dinesh1708@gmail.com       | 98745685424 | 108 A Shindhi colony | Indore        | India   |
|       8 | Sonu      | Patel    | Sonupatel08@gmail.com      | 8457824542  | Near Medicaps        | Indore        | India   |
+---------+-----------+----------+----------------------------+-------------+----------------------+---------------+---------+
 */