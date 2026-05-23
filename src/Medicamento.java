
public class Medicamento {
     // ATRIBUTOS
    private String nombre;
    private double precio;
    private String dosis;
    private String laboratorio;

    // CONSTRUCTOR
    public Medicamento(String nombre,
                       double precio,
                       String dosis,
                       String laboratorio) {

        this.nombre = nombre;
        this.precio = precio;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    // MÉTODO
    public void mostrarMedicamento() {

        System.out.println(" MEDICAMENTO ");

        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: S/ " + precio);
        System.out.println("Dosis: " + dosis);
        System.out.println("Laboratorio: " + laboratorio);
    }
}

