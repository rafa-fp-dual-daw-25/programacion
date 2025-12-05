import java.time.LocalDate;
import java.time.Period;

public class Titular {

    final static char SEXO = 'M';
    private String nombre;
    private LocalDate fechaNacimiento;
    private String DNI;
    private char sexo;
    private String direccion;

    public Titular(String nombre, LocalDate fechaNacimiento, String DNI, char sexo, String direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public Titular(String nombre, LocalDate fechaNacimiento, char sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.DNI = "";
        this.direccion = "";
        comprobarSexo(sexo);
    }

    public Titular() {
        this("", LocalDate.of(1900, 1, 1), SEXO);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public boolean esMayorDeEdad() {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        return periodo.getYears() >= 18;
    }

    public void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        } else {
            this.sexo = sexo;
        }
    }
}
