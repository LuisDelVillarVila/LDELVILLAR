package LDELVILLARV.LDELVILLARV.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "asignatura")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Asignatura extends Profesor {

    @Column(name = "curso",length = 12,nullable = false)
    private  String curoso;

    public Asignatura() {

    }

    public String getCuroso() {
        return curoso;
    }

    public void setCuroso(String curoso) {
        this.curoso = curoso;
    }

    @Override
    public String toString() {
        return "asignatura{" +
                "curoso='" + curoso + '\'' +
                '}';
    }
}
