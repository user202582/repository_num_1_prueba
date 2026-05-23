
public class Enfermero extends Persona {
    
    // ATRIBUTOS
    private String codigoEnfermero;
    private String turno;

    // CONSTRUCTOR
    public Enfermero(String nombre,
                     String dni,
                     String telefono,
                     String direccion,
                     String codigoEnfermero,
                     String turno) {

        super(nombre, dni, telefono, direccion);

        this.codigoEnfermero = codigoEnfermero;
        this.turno = turno;
    }

    // GETTERS Y SETTERS
    public String getCodigoEnfermero() {
        return codigoEnfermero;
    }

    public void setCodigoEnfermero(String codigoEnfermero) {
        this.codigoEnfermero = codigoEnfermero;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // MÉTODOS
    public void asistirPaciente() {

        System.out.println("Paciente asistido.");
    }

    @Override
    public void mostrarDatos() {

        System.out.println("===== ENFERMERO =====");

        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigoEnfermero);
        System.out.println("Turno: " + turno);
    }
}