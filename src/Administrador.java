public class Administrador extends Persona{
    
    // ATRIBUTOS
    private String codigoAdministrador;
    private String cargo;

    // CONSTRUCTOR
    public Administrador(String nombre,
                         String dni,
                         String telefono,
                         String direccion,
                         String codigoAdministrador,
                         String cargo) {

        super(nombre, dni, telefono, direccion);

        this.codigoAdministrador = codigoAdministrador;
        this.cargo = cargo;
    }

    // GETTERS Y SETTERS
    public String getCodigoAdministrador() {
        return codigoAdministrador;
    }

    public void setCodigoAdministrador(String codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // MÉTODOS
    public void gestionarSistema() {

        System.out.println("Sistema gestionado.");
    }

    @Override
    public void mostrarDatos() {

        System.out.println(" ADMINISTRADOR ");

        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigoAdministrador);
        System.out.println("Cargo: " + cargo);
    }
}