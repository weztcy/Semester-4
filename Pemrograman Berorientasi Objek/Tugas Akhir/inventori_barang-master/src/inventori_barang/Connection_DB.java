package inventori_barang;

import java.sql.*;
import javax.swing.JOptionPane;

public class Connection_DB {

    public Connection conn;

    public Connection_DB() {
    }

    public Connection openkoneksi() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connURL = "jdbc:mysql://localhost:3306/dimpra_autocar?autoReconnect=true&useSSL=false" + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(connURL, user, password);
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "There is no open connections or misconfigured databases!");
            return null;
        }
    }

    public void closekoneksi() throws SQLException {
        try {
            if (conn != null) {
                System.out.print("Connection ended!\n");
            }
        } catch (Exception ex) {
        }
    }
}
