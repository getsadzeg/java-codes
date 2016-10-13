
package ge.mziuri.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Runner {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db", "postgres", "rame");
            Statement st = conn.createStatement();
            st.executeUpdate("CREATE TABLE country ( id INT PRIMARY KEY, name VARCHAR(30))");
            System.out.println("table created");
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
