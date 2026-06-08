import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                "root123"
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(" create DATABASE dd");

            

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}