package SoftwareMatricula.controller;

import SoftwareMatricula.model.Alumno;
import SoftwareMatricula.service.AlumnoService;
import java.util.List;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class AlumnoController {

        // attributes:
        private static final AlumnoService ALUMNO_SERVICE = new AlumnoService();
        private String message_busqueda;

        // metodos:
        public void createAlumno(Alumno alumno) {
        }

        public void deleteAlumno(int id) {
        }

        public Alumno readAlumnoByID(int id) {

                return null;
        }

        public Alumno readAlumno(String data) {

                return null;
        }

        public List<Alumno> readAlumnos() {

                return null;
        }

        public void updateAlumno(Alumno alumno) {
        }

        //getters

        public String getMessage_busqueda() {
                var message_busqueda = this.message_busqueda;
                this.message_busqueda = null;
                return message_busqueda;
        }
        
}
