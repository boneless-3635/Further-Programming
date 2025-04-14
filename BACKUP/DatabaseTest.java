package T6;

import java.sql.*;
import java.util.Scanner;

public class DatabaseTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            PreparedStatement nameQueryStatement = conn.prepareStatement("SELECT * FROM students WHERE name = ?");

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                String major = rs.getString("major");
                System.out.printf("%d %s %s%n", id, name, major);
            }

//            Student name search
            System.out.println("Please enter a student name you want to search:");
            String nameToSearch = userInput.nextLine();
            nameQueryStatement.setString(1, nameToSearch);
            ResultSet nameQueryResult = nameQueryStatement.executeQuery();

            while (nameQueryResult.next()) {
                int id = nameQueryResult.getInt(1);
                String name = nameQueryResult.getString("name");
                String major = nameQueryResult.getString("major");
                System.out.printf("%d %s %s%n", id, name, major);
            }

            conn.close();
            st.close();
            nameQueryStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }

}
