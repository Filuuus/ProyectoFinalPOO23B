package proyectofinal;

/**
 *
 * @author juanmartinhurtado
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private String carrera;
    private String sexo;

    public Persona(String nombre, String apellidos, String carrera, String sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
