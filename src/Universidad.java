public class Universidad {
    private String nombre;
    private String codigo;
    private String direccion;
    private String telefono;

    public Universidad() {}

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String mostrarInfo() {
        return "| " + nombre + " | " + codigo + " | " + direccion + " | " + telefono + " |";
    }
}