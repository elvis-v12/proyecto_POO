
package SofwareAsistencia.doa.Asistencias;

import SofwareAsistencia.controler.metodos.Asignatura;
import java.util.List;


public interface AsignaturaDao {
    public void create(Asignatura asignatura);
        public Asignatura read(Integer id);
        public List<Asignatura> readAll();
        public Asignatura update (Asignatura asignatura);
        public void delete(Integer id);
}

