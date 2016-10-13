
package ge.mziuri.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Runner {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db", "postgres", "rame");
            Statement st = conn.createStatement();
            st.executeUpdate("CREATE TABLE country ( id INT PRIMARY KEY, name VARCHAR(30))");
            st.executeUpdate("INSERT INTO country VALUES( 1, 'საქართველო')");
            st.executeUpdate("INSERT INTO country VALUES( 2, 'ინგლისი')");
            ResultSet rs = st.executeQuery("SELECT * FROM country");
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " " + name);
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
