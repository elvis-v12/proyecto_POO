package SoftwareMatricula.dao;

import SoftwareMatricula.model.Alumno;
import java.util.List;

/**
 *
 * 
 */
public interface alumnoDao {

        public void createAlumno(Alumno alumno);

        public Alumno readAlumno(int id);

        public List<Alumno> readAlumnos();

        public void updateAlumno(Alumno alumno);

        public void deleteAlumno(int id);

}
