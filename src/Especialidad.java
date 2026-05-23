public class Especialidad {
     
// ATRIBUTOS
    private String codigoEspecialidad;
    private String nombreEspecialidad;
    private String descripcion;

    // CONSTRUCTOR
    public Especialidad(String codigoEspecialidad,
                        String nombreEspecialidad,
                        String descripcion) {

        this.codigoEspecialidad = codigoEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.descripcion = descripcion;
    }

    // GETTERS Y SETTERS
    public String getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(String codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // MÉTODO
    public void mostrarEspecialidad() {

        System.out.println(" ESPECIALIDAD ");

        System.out.println("Codigo: " + codigoEspecialidad);
        System.out.println("Nombre: " + nombreEspecialidad);
        System.out.println("Descripcion: " + descripcion);
    }
}