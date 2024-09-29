import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        
        Connection con = null;
        java.beans.Statement st = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "root");
            System.out.println("Driver Loaded");

            st = con.createStatement();

            String query = "INSERT INTO Guests VALUES ('7','Dinesh','Sharma','dinesh1708@gmail.com','98745685424','108 A Shindhi colony','Indore','India')";
            int i = st.executeUpdate(query);

            if (i > 0) {
                System.out.println(i + "Record Inserted...");
            } else {
                System.out.println("Record Insertion Failed...");
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
+---------+-----------+----------+----------------------------+-------------+----------------------+---------------+---------+
 */