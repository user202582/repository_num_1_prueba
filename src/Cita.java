public class Cita {
    // ATRIBUTOS
    private String fecha;
    private String hora;
    private String estado;

    // RELACIONES
    private Paciente paciente;
    private Medico medico;

    // CONSTRUCTOR
    public Cita(String fecha,
                String hora,
                String estado,
                Paciente paciente,
                Medico medico) {

        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
    }

    // GETTERS Y SETTERS
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    // MÉTODOS
    public void programarCita() {
        System.out.println("Cita programada.");
    }

    public void cancelarCita() {
        System.out.println("Cita cancelada.");
    }

    public void mostrarCita() {

        System.out.println("===== CITA MEDICA =====");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Estado: " + estado);

        System.out.println("\n--- PACIENTE ---");
        paciente.mostrarDatos();

        System.out.println("\n--- MEDICO ---");
        medico.mostrarDatos();
    }
}

