package SoftwareMatricula.model;

import java.util.Date;

/**
 *
 * 
 */
public class Registro {
//atributos
        private Integer IDRegistro;
        private Date fechaRegistro;
        private Integer IDAlumno;

//constructor
        public Registro(Integer IDRegistro, Date fechaRegistro, Integer IDAlumno) {
                this.IDRegistro = IDRegistro;
                this.fechaRegistro = fechaRegistro;
                this.IDAlumno = IDAlumno;
        }

        public Registro(Date fechaRegistro, Integer IDAlumno) {
                this.IDRegistro = null;
                this.fechaRegistro = fechaRegistro;
                this.IDAlumno = IDAlumno;
        }
//metodos

        public Integer getIDRegistro() {
                return IDRegistro;
        }

        public Date getFechaRegistro() {
                return fechaRegistro;
        }

        public void setFechaRegistro(Date fechaRegistro) {
                this.fechaRegistro = fechaRegistro;
        }

        public Integer getIDAlumno() {
                return IDAlumno;
        }

        public void setIDAlumno(Integer IDAlumno) {
                this.IDAlumno = IDAlumno;
        }

}