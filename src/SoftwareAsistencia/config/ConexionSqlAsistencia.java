
package SoftwareAsistencia.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionSqlAsistencia {
     private String url = "jdbc:mysql://localhost:3306/registrosalumnos";
    private String usuario = "root";
    private String contraseña = "";
    private Connection conexion = null;
     public ConexionSqlAsistencia() {
        try {
            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // No cierres la conexión aquí
            } else {
                System.err.println("La conexión a la base de datos ha fallado.");
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return conexion;
    }
   public static void main(String[]args){
       ConexionSqlAsistencia asistencia=new ConexionSqlAsistencia();
   }
}
