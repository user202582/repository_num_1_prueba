
public class HistoriaClinica {
    // ATRIBUTOS
    private String codigoHistoria;
    private String diagnostico;
    private String alergias;
    private String observaciones;

    // RELACIÓN
    private Paciente paciente;

    // CONSTRUCTOR
    public HistoriaClinica(String codigoHistoria,
                           String diagnostico,
                           String alergias,
                           String observaciones,
                           Paciente paciente) {

        this.codigoHistoria = codigoHistoria;
        this.diagnostico = diagnostico;
        this.alergias = alergias;
        this.observaciones = observaciones;
        this.paciente = paciente;
    }

    // GETTERS Y SETTERS
    public String getCodigoHistoria() {
        return codigoHistoria;
    }

    public void setCodigoHistoria(String codigoHistoria) {
        this.codigoHistoria = codigoHistoria;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    // MÉTODOS
    public void agregarDiagnostico(String nuevoDiagnostico) {

        this.diagnostico = nuevoDiagnostico;

        System.out.println("Diagnóstico actualizado.");
    }

    public void mostrarHistoriaClinica() {

        System.out.println(" HISTORIA CLINICA ");

        System.out.println("Codigo: " + codigoHistoria);
        System.out.println("Diagnostico: " + diagnostico);
        System.out.println("Alergias: " + alergias);
        System.out.println("Observaciones: " + observaciones);

        System.out.println("\n--- PACIENTE ---");

        paciente.mostrarDatos();
    }
}
    
