package SoftwareMatricula.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class ConexiónBBDD {

//atributos
        private static final String DB_URL = "jdbc:h2:./Data(ACA Falta xd)/Colegio";
        public Connection conexion;
//constructor

        public ConexiónBBDD() {
                try {
                        conexion = DriverManager.getConnection(DB_URL);
                        Statement stmt = conexion.createStatement();
                        String createTableSQL = "CREATE TABLE IF NOT EXISTS Alumnos ("
                                                + "id_alumno INT AUTO_INCREMENT PRIMARY KEY,"
                                                + "dni VARCHAR(20) NOT NULL,"
                                                + "nombre VARCHAR(50) NOT NULL,"
                                                + "apellido_paterno VARCHAR(50) NOT NULL,"
                                                + "apellido_materno VARCHAR(50),"
                                                + "edad INT,"
                                                + "grado VARCHAR(10)"
                                                + ");";
                        stmt.execute(createTableSQL);

                        System.out.println("Base de datos iniciados");
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }
}
