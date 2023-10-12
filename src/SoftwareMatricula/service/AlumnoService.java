package SoftwareMatricula.service;

import SoftwareMatricula.config.ConexiónBBDD;
import SoftwareMatricula.dao.alumnoDao;
import SoftwareMatricula.model.Alumno;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class AlumnoService implements alumnoDao {

//atributos
        private ConexiónBBDD conexiónBBDD;

//constructor
        public AlumnoService() {
                conexiónBBDD = new ConexiónBBDD();
        }

//metodos
        @Override
        public void createAlumno(Alumno alumno) {
                try {
                        String insertQuery = "INSERT INTO Alumnos (dni, nombre, apellido_paterno, apellido_materno, edad, grado) "
                                             + "VALUES (?, ?, ?, ?, ?, ?)";

                        PreparedStatement preparedStatement = conexiónBBDD.conexion.prepareStatement(insertQuery);
                        preparedStatement.setString(1, alumno.getDni());
                        preparedStatement.setString(2, alumno.getNombre());
                        preparedStatement.setString(3, alumno.getApellido_paterno());
                        preparedStatement.setString(4, alumno.getApellido_materno());
                        preparedStatement.setInt(5, alumno.getEdad());
                        preparedStatement.setString(6, alumno.getGrado());

                        preparedStatement.executeUpdate();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        @Override
        public void deleteAlumno(int id) {
                try {
                        String deleteQuery = "DELETE FROM Alumnos WHERE id_alumno = ?";
                        PreparedStatement preparedStatement = conexiónBBDD.conexion.prepareStatement(deleteQuery);
                        preparedStatement.setInt(1, id);

                        preparedStatement.executeUpdate();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        @Override
        public Alumno readAlumno(int id) {
                try {
                        String selectQuery = "SELECT * FROM Alumnos WHERE id_alumno = ?";
                        PreparedStatement preparedStatement = conexiónBBDD.conexion.prepareStatement(selectQuery);
                        preparedStatement.setInt(1, id);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {
                                return new Alumno(
                                        resultSet.getInt("id_alumno"),
                                        resultSet.getString("dni"),
                                        resultSet.getString("nombre"),
                                        resultSet.getString("apellido_paterno"),
                                        resultSet.getString("apellido_materno"),
                                        resultSet.getInt("edad"),
                                        resultSet.getString("grado")
                                );
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }

                return null;
        }

        @Override
        public List<Alumno> readAlumnos() {
                List<Alumno> alumnos = new ArrayList<>();

                try {
                        String selectQuery = "SELECT * FROM Alumnos";
                        PreparedStatement preparedStatement = conexiónBBDD.conexion.prepareStatement(selectQuery);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        while (resultSet.next()) {
                                Alumno alumno = new Alumno(
                                        resultSet.getInt("id_alumno"),
                                        resultSet.getString("dni"),
                                        resultSet.getString("nombre"),
                                        resultSet.getString("apellido_paterno"),
                                        resultSet.getString("apellido_materno"),
                                        resultSet.getInt("edad"),
                                        resultSet.getString("grado")
                                );
                                alumnos.add(alumno);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }

                return alumnos;
        }

        @Override
        public void updateAlumno(Alumno alumno) {
                try {
                        String updateQuery = "UPDATE Alumnos SET dni=?, nombre=?, apellido_paterno=?, apellido_materno=?, edad=?, grado=? "
                                             + "WHERE id_alumno=?";
                        PreparedStatement preparedStatement = conexiónBBDD.conexion.prepareStatement(updateQuery);
                        preparedStatement.setString(1, alumno.getDni());
                        preparedStatement.setString(2, alumno.getNombre());
                        preparedStatement.setString(3, alumno.getApellido_paterno());
                        preparedStatement.setString(4, alumno.getApellido_materno());
                        preparedStatement.setInt(5, alumno.getEdad());
                        preparedStatement.setString(6, alumno.getGrado());
                        preparedStatement.setInt(7, alumno.getId_alumno());

                        preparedStatement.executeUpdate();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }
}
