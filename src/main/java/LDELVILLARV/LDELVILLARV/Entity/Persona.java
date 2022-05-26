package LDELVILLARV.LDELVILLARV.Entity;
import javax.persistence.*;


@Entity
@Table(name = "persona")
@Inheritance( strategy = InheritanceType.JOINED )
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private long idpersona;

    @Column(name = "nombre", length = 50, nullable = false)
    private  String nombre;

    @Column(name = "telefono", length = 50, nullable = false)
    private  String telefeno;

    @Column(name = "email", length = 100, nullable = false)
    private  String email;

    public Persona() {
    }

    public Persona(long idpersona) {
        this.idpersona = idpersona;
    }

    public Persona(String nombre, String telefeno, String email) {
        this.nombre = nombre;
        this.telefeno = telefeno;
        this.email = email;
    }

    public long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(String telefeno) {
        this.telefeno = telefeno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona +
                ", nombre='" + nombre + '\'' +
                ", telefeno='" + telefeno + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
