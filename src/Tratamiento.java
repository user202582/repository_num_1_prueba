
public class Tratamiento { 
    
    private String nombreTratamiento;
    private String descripcion;
    private int duracionDias; 

    private HistoriaClinica historiaClinica; 
    
    public Tratamiento(String nombreTratamiento,
                       String descripcion,
                       int duracionDias,
                       HistoriaClinica historiaClinica) {
        
        this.nombreTratamiento = nombreTratamiento; 
        this.descripcion = descripcion; 
        this.duracionDias = duracionDias;
        this.historiaClinica = historiaClinica; 
    }

 
    public String getNombreTratamiento() { 
        return nombreTratamiento;
    }

    public void setNombreTratamiento(String nombreTratamiento) { 
        this.nombreTratamiento = nombreTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }


    public void iniciarTratamiento() {

        System.out.println("Tratamiento iniciado.");
    }

    public void finalizarTratamiento() {

        System.out.println("Tratamiento finalizado.");
    }

    public void mostrarTratamiento() {

        System.out.println(" TRATAMIENTO ");

        System.out.println("Nombre: " + nombreTratamiento);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Duracion: " + duracionDias + " dias");

        System.out.println("\n HISTORIA CLINICA ");

        System.out.println("Codigo Historia: "
                + historiaClinica.getCodigoHistoria());
    }
}
    
