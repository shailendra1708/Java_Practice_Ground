
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUserData {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id :");
        int GuestID = sc.nextInt();

        System.out.print("Enter FirstName : ");
        String FirstName = sc.next();

        System.out.print("Enter LastName : ");
        String LastName = sc.next();

        System.out.print("Enter Email : ");
        String Email = sc.next();

        System.out.print("Enter Phone : ");
      double Phone = sc.nextDouble();

        System.out.print("Enter Address :");
        String Address = sc.next();

        System.out.print("Enter City : ");
        String City = sc.next();

        System.out.print("Enter Country : ");
        String Country = sc.next();

        try {
            // Load MySQL JDBC Driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            // Establish Connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "root");
            System.out.println("Connection Established");

            // Create Statement
            st = con.createStatement();

            // Define INSERT query with column names (omit GuestID if it's auto-increment)
            //String query = "INSERT INTO Guests VALUES (8, 'Sonu', 'Patel', 'Sonupatel 08@gmail.com', '98745685424', '108 A Shindhi colony', 'Indore', 'India')";
            String query = "INSERT INTO Guests VALUES ('" + GuestID + "', '" + FirstName + "', '" + LastName + "', '" + Email + "', '" + Phone + "', '" + Address + "', '" + City + "', '" + Country + "')";
            System.out.println("Query = "+query);
            // Execute INSERT query
            int i = st.executeUpdate(query);

            // Check if insertion was successful
            if (i > 0) {
                System.out.println(i + " Record Inserted...");
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
 +---------+------------+----------+----------------------------+--------------+----------------------+-------------+---------+
| GuestID | FirstName  | LastName | Email                      | Phone        | Address              | City        | Country |
+---------+------------+----------+----------------------------+--------------+----------------------+-------------+---------+
|       1 | John       | Doe      | john.doe@example.com       | 1234567890   | 123 Main St          | New York    | USA     |
|       2 | Emily      | Williams | emily.williams@example.com | 9876543210   | 456 Elm St           | Los Angeles | USA     |
|       3 | Michael    | Brown    | michael.brown@example.com  | 9988776655   | 789 Oak St           | Chicago     | USA     |
|       4 | Sophia     | Davis    | sophia.davis@example.com   | 1122334455   | 101 Pine St          | Miami       | USA     |
|       6 | Olivia     | Garcia   | olivia.garcia@example.com  | 3213213210   | 303 Birch St         | Dallas      | USA     |
|       7 | Dinesh     | Sharma   | dinesh1708@gmail.com       | 98745685424  | 108 A Shindhi colony | Indore      | India   |
|       8 | Sonu       | Patel    | Sonupatel08@gmail.com      | 8457824542   | Near Medicaps        | Indore      | India   |
|      10 | Shailendra | Verma    | sidVerma@gmail.com         | 8.45796251E8 | Bholaram             | Ustad       | Marg    |
+---------+------------+----------+----------------------------+--------------+----------------------+-------------+---------+
 */
