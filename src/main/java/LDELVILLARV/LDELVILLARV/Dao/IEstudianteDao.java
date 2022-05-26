package LDELVILLARV.LDELVILLARV.Dao;

import LDELVILLARV.LDELVILLARV.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao  extends JpaRepository<Estudiante,Long> {
    @Query("SELECT p FROM Estudiante p WHERE p.codigo= ?1")
    Estudiante buscarEstudiante(String codigo);

    Estudiante findByCodigo(String codigo);



}
