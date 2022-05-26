package LDELVILLARV.LDELVILLARV.Dao;
import LDELVILLARV.LDELVILLARV.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPersonaDao   extends JpaRepository<Persona,Long>{

    @Query("SELECT p FROM Persona p WHERE p.idpersona = ?1")
    Persona buscarPersona(String idpersona);


}
