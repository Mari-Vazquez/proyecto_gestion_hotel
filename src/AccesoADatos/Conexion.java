package AccesoADatos;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "hotel_equipo21";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = java.sql.DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "conectado");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "error al cargar los drivers");
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
        }
        return connection;
    }
}
