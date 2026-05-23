public class Paciente extends Persona {
   private String codigoPaciente;
    private String seguroMedico;

    // CONSTRUCTOR
    public Paciente(String nombre, String dni,
                     String telefono, String direccion,
                     String codigoPaciente,
                     String seguroMedico) {

        super(nombre, dni, telefono, direccion);

        this.codigoPaciente = codigoPaciente;
        this.seguroMedico = seguroMedico;
    }

    // GETTERS Y SETTERS
    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(String seguroMedico) {
        this.seguroMedico = seguroMedico;
    }

    // MÉTODO PROPIO
    public void solicitarCita() {
        System.out.println("Cita solicitada.");
    }

    // POLIMORFISMO
    @Override
    public void mostrarDatos() {

        System.out.println("PACIENTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Seguro: " + seguroMedico);
        
    }
    
}