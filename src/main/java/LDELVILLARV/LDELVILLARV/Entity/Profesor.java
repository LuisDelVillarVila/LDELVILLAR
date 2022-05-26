package LDELVILLARV.LDELVILLARV.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Profesor extends Persona  {

    @Column(name = "salario",length = 12,nullable = false)
    private  String salario;

    @Column(name = "cod_docente", length = 12)
    private String codDocente;


    public Profesor() {
    }

    public Profesor(String codDocente) {
        this.codDocente = codDocente;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(String codDocente) {
        this.codDocente = codDocente;
    }
}
