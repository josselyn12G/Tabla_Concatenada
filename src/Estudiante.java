

public class Estudiante {
    private String nombre;
    private String apellido;
    private String carrera;
    private String semestre;
    private String banner;

    public Estudiante() {}

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public String getSemestre() { return semestre; }
    public void setSemestre(String semestre) { this.semestre = semestre; }

    public String getBanner() { return banner; }
    public void setBanner(String banner) { this.banner = banner; }

    public String imprimir() {
        return "| " + nombre + " | " + apellido + " | " + carrera + " | " + semestre + " | " + banner + " |";
    }
}