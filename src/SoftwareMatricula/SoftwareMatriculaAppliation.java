package SoftwareMatricula;

import SoftwareMatricula.view.alumno.jfrmAlumno;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 *
 */
public class SoftwareMatriculaAppliation {

        public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(() -> new jfrmAlumno().setVisible(true));
        }

}
