
public class Pago {
    // ATRIBUTOS
    private String codigoPago;
    private double monto;
    private String metodoPago;
    private String estado;

    // RELACIÓN
    private Paciente paciente;

    // CONSTRUCTOR
    public Pago(String codigoPago,
                double monto,
                String metodoPago,
                String estado,
                Paciente paciente) {

        this.codigoPago = codigoPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estado = estado;
        this.paciente = paciente;
    }

    // GETTERS Y SETTERS
    public String getCodigoPago() {
        return codigoPago;
    }

    public void setCodigoPago(String codigoPago) {
        this.codigoPago = codigoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
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

    // MÉTODOS
    public void realizarPago() {

        estado = "Pagado";

        System.out.println("Pago realizado correctamente.");
    }

    public void mostrarPago() {

        System.out.println(" PAGO ");

        System.out.println("Codigo: " + codigoPago);
        System.out.println("Monto: S/ " + monto);
        System.out.println("Metodo: " + metodoPago);
        System.out.println("Estado: " + estado);

        System.out.println("\n--- PACIENTE ---");

        paciente.mostrarDatos();
    }
}
