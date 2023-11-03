package SofwareAsistencia.controler.metodos;

import SoftwareAsistencia.config.ConexionSQL;
import SofwareAsistencia.doa.Asistencias.AsignaturaDao;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;

public class CursoServices implements AsignaturaDao {

    ConexionSQL ConexionSQL = new ConexionSQL();

    @Override
    public void create(Asignatura asignatura) {
  
        try {
            String sql = "INSERT INTO cursos (nombre) VALUES ( ?)";
            PreparedStatement preparedStatement = ConexionSQL.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, asignatura.getNombre());

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Curso guardado exitosamente");
            } else {
                System.out.println("No se pudo guardar el curso");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }

   @Override
    public Asignatura read(Integer id) {
        
        return null;
        
    }

    @Override
    public List<Asignatura> readAll() {
      
        return null;
      
    }

    @Override
    public Asignatura update(Asignatura asignatura) {
        return null;
    }

    @Override
    public void delete(Integer id) {
       
    }
    }

