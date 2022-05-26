package LDELVILLARV.LDELVILLARV.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "direcccion")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Direccion extends Persona {

    @Column(name = "calle",length = 50,nullable = false)
    private  String calle;

    @Column(name = "ciudad",length = 50,nullable = false)
    private  String ciudad;

    @Column(name = "estado",length = 50,nullable = false)
    private  String estado;

    @Column(name = "cod_postal",length = 12,nullable = false)
    private  String codPostal;

    @Column(name = "pais",length = 50,nullable = false)
    private  String pais;

    public Direccion() {

    }



    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", estado='" + estado + '\'' +
                ", codPostal='" + codPostal + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
