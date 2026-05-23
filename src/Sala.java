
public class Sala {
     // ATRIBUTOS
    private String numeroSala;
    private String tipoSala;
    private int capacidad;

    // RELACIÓN
    private Enfermero enfermero;

    // CONSTRUCTOR
    public Sala(String numeroSala,
                String tipoSala,
                int capacidad,
                Enfermero enfermero) {

        this.numeroSala = numeroSala;
        this.tipoSala = tipoSala;
        this.capacidad = capacidad;
        this.enfermero = enfermero;
    }

    // GETTERS Y SETTERS
    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // MÉTODOS
    public void asignarSala() {

        System.out.println("Sala asignada.");
    }

    public void mostrarSala() {

        System.out.println(" SALA ");

        System.out.println("Numero: " + numeroSala);
        System.out.println("Tipo: " + tipoSala);
        System.out.println("Capacidad: " + capacidad);

        System.out.println("\n ENFERMERO ");

        enfermero.mostrarDatos();
    }
}

