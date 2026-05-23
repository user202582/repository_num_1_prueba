public abstract class Persona {
    
    // ATRIBUTOS
    protected String nombre;
    protected String dni;
    protected String telefono;
    protected String direccion;

    // CONSTRUCTOR
    public Persona(String nombre, String dni,
                   String telefono, String direccion) {

        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // MÉTODO ABSTRACTO, SOBRE ESCRITURA---NO BORRAR
    public abstract void mostrarDatos();
}