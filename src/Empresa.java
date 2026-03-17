import java.util.Objects;

public class Empresa {

    private long id;
    private String razonSocial;
    private String nombreComercial;
    private String formaJuridica;
    private String cif;
    private String direccionFiscal;
    private String telefono;
    private String email;

    private Empresa() {
    }

    public Empresa(long id, String razonSocial, String nombreComercial, String formaJuridica, String cif, String direccionFiscal, String telefono, String email) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.nombreComercial = nombreComercial;
        this.formaJuridica = formaJuridica;
        this.cif = cif;
        this.direccionFiscal = direccionFiscal;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", razonSocial='" + razonSocial + '\'' +
                ", nombreComercial='" + nombreComercial + '\'' +
                ", formaJuridica='" + formaJuridica + '\'' +
                ", cif='" + cif + '\'' +
                ", direccionFiscal='" + direccionFiscal + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return id == empresa.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}