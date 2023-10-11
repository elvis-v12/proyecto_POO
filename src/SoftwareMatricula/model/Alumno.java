package SoftwareMatricula.model;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class Alumno {

//atributos
        private int id_alumno;
        private String dni;
        private String nombre;
        private String apellido_paterno;
        private String apellido_materno;
        private int edad;
        private String grado;

//constructor
        public Alumno() {
        }

        public Alumno(int id_alumno, String dni, String nombre, String apellido_paterno, String apellido_materno, int edad, String grado) {
                this.id_alumno = id_alumno;
                this.dni = dni;
                this.nombre = nombre;
                this.apellido_paterno = apellido_paterno;
                this.apellido_materno = apellido_materno;
                this.edad = edad;
                this.grado = grado;
        }

//metodos
        public int getId_alumno() {
                return id_alumno;
        }

        public void setId_alumno(int id_alumno) {
                this.id_alumno = id_alumno;
        }

        public String getDni() {
                return dni;
        }

        public void setDni(String dni) {
                this.dni = dni;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido_paterno() {
                return apellido_paterno;
        }

        public void setApellido_paterno(String apellido_paterno) {
                this.apellido_paterno = apellido_paterno;
        }

        public String getApellido_materno() {
                return apellido_materno;
        }

        public void setApellido_materno(String apellido_materno) {
                this.apellido_materno = apellido_materno;
        }

        public int getEdad() {
                return edad;
        }

        public void setEdad(int edad) {
                this.edad = edad;
        }

        public String getGrado() {
                return grado;
        }

        public void setGrado(String grado) {
                this.grado = grado;
        }

}
