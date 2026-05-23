
public class Receta {
    // ATRIBUTOS
    private String codigoReceta;
    private String indicaciones;

    // RELACIONES
    private Medicamento medicamento;
    private Medico medico;
    private Paciente paciente;

    // CONSTRUCTOR
    public Receta(String codigoReceta,
                  String indicaciones,
                  Medicamento medicamento,
                  Medico medico,
                  Paciente paciente) {

        this.codigoReceta = codigoReceta;
        this.indicaciones = indicaciones;
        this.medicamento = medicamento;
        this.medico = medico;
        this.paciente = paciente;
    }

    // GETTERS Y SETTERS
    public String getCodigoReceta() {
        return codigoReceta;
    }

    public void setCodigoReceta(String codigoReceta) {
        this.codigoReceta = codigoReceta;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    // MÉTODOS
    public void emitirReceta() {

        System.out.println("Receta emitida.");
    }

    public void mostrarReceta() {

        System.out.println(" RECETA ");

        System.out.println("Codigo: " + codigoReceta);

        System.out.println("Indicaciones: " + indicaciones);

        System.out.println("\n--- MEDICAMENTO ---");

        medicamento.mostrarMedicamento();

        System.out.println("\n--- MEDICO ---");

        medico.mostrarDatos();

        System.out.println("\n--- PACIENTE ---");

        paciente.mostrarDatos();
    }
}
