public class Medico extends Persona {
    
  // ATRIBUTOS
    private String cmp;
    private Especialidad especialidad; 

    // CONSTRUCTOR
    public Medico(String nombre,
                  String dni,
                  String telefono,
                  String direccion,
                  String cmp,
                  Especialidad especialidad) { 

        super(nombre, dni, telefono, direccion);

        this.cmp = cmp;
        this.especialidad = especialidad;
    }

    // GETTERS Y SETTERS
    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }

    
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    // MÉTODOS
    public void atenderPaciente() {
        System.out.println("Paciente atendido.");
    }

    public void emitirReceta() {
        System.out.println("Receta emitida.");
    }
    
    // Metodo 2
    public void emitirReceta(String medicamento) {
        System.out.println("Medicamento recetado: " + medicamento);
    }

    // Metodo 3
    public void emitirReceta(String medicamento, String dosis) {
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Dosis: " + dosis);
    }

    // POLIMORFISMO
    @Override
    public void mostrarDatos() {
        System.out.println("===== MEDICO =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("CMP: " + cmp);
        
        System.out.println("Especialidad: " + especialidad.getNombreEspecialidad());
        System.out.println("Codigo Especialidad: " + especialidad.getCodigoEspecialidad());
    }
}