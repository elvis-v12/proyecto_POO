package SoftwareMatricula;

import SoftwareMatricula.view.alumno.jfrmMatriculaAlumno;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 *
 */
public class SoftwareMatriculaAppliation {

        public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(() -> new jfrmMatriculaAlumno().setVisible(true));
        }

}
