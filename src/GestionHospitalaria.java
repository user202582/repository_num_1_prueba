
import java.util.ArrayList;
import java.util.List;


public class GestionHospitalaria {
    
 public static void main(String[] args) {
     
     System.out.println(" SISTEMA DE GESTIÓN HOSPITALARIA\n");
        Especialidad especialidad1 = new Especialidad(
                "ESP001",            
                "Cardiologia",         
                "Enfermedades del corazon" 
        );
        Medico medico1 = new Medico(
                "Carlos Ramirez",
                "45678912",
                "999888777",
                "Lima",
                "CMP123",
                especialidad1
        );
        Paciente paciente1 = new Paciente(
                "Juan Perez",
                "76543210",
                "987654321",
                "Trujillo",
                "P001",
                "Essalud"
        );
        Cita cita1 = new Cita(
                "15/05/2026",
                "10:30 AM",
                "Programada",
                paciente1,
                medico1
        );
        HistoriaClinica historia1 = new HistoriaClinica(
                "HC001",
                "Hipertension",
                "Penicilina",
                "Paciente estable",
                paciente1
        );
        Tratamiento tratamiento1 = new Tratamiento(
                "Control Presion",
                "Medicacion y reposo",
                30,
                historia1
        );
        Medicamento medicamento1 = new Medicamento(
                "Paracetamol",
                15.50,
                "500mg",
                "Bayer"
        );
        Receta receta1 = new Receta(
                "R001",
                "Tomar cada 8 horas",
                medicamento1,
                medico1,
                paciente1
        );
        Pago pago1 = new Pago(
                "PG001",
                250.00,
                "Tarjeta",
                "Pendiente",
                paciente1
        );
        Enfermero enfermero1 = new Enfermero(
                "Maria Lopez",
                "74125896",
                "999111222",
                "Lima",
                "ENF001",
                "Noche"
        );
        Sala sala1 = new Sala(
                "S101",
                "Emergencia",
                4,
                enfermero1
        );
        Administrador admin1 = new Administrador(
                "Ana Castro",
                "12345678",
                "955667788",
                "Trujillo",
                "ADM001",
                "JEFE DE SISTEMAS"
        );
       
        System.out.println("CONSULTAS \n");

        System.out.println("Nombre del paciente:");
        System.out.println(paciente1.getNombre());

        System.out.println("\nEspecialidad del medico:");
        System.out.println( medico1.getEspecialidad().getNombreEspecialidad());

        System.out.println("\nEstado de la cita:");
        System.out.println(cita1.getEstado());


        System.out.println("\nDiagnostico:");
        System.out.println(historia1.getDiagnostico());


        System.out.println("\nMedicamento recetado:");
        System.out.println(receta1.getMedicamento().getNombre());


        System.out.println("\nPrecio medicamento:");
        System.out.println("S/. " + medicamento1.getPrecio());

        System.out.println("\nMonto del pago:");
        System.out.println( "S/. " + pago1.getMonto());

        System.out.println("\nTurno enfermero:");
        System.out.println(enfermero1.getTurno());

        System.out.println("\nTipo de sala:");
        System.out.println(sala1.getTipoSala());

        System.out.println("\nDuracion tratamiento:");
        System.out.println(tratamiento1.getDuracionDias() + " dias");
        
   
        System.out.println("\nCargo del Administrador:");
        System.out.println(admin1.getCargo());



        System.out.println("\n METODOS \n");

        paciente1.solicitarCita();

        medico1.atenderPaciente();

        pago1.realizarPago();

        tratamiento1.iniciarTratamiento();

        enfermero1.asistirPaciente();
        
        admin1.gestionarSistema();
        
        System.out.println("\n DATOS DE ESPECIALIDAD ");
        especialidad1.mostrarEspecialidad();
        
        System.out.println("\n===== UPCASTING Y DOWNCASTING =====\n");

        // ---------- UPCASTING ----------
        // Convertir un objeto hijo a tipo padre automáticamente

        Persona persona1 = medico1; // Upcasting
        Persona persona2 = paciente1; // Upcasting
        Persona persona3 = enfermero1; // Upcasting

        System.out.println("UPCASTING:");
        System.out.println(persona1.getNombre());
        System.out.println(persona2.getNombre());
        System.out.println(persona3.getNombre());


        // ---------- DOWNCASTING ----------
        // Convertir nuevamente el tipo padre al tipo hijo

       Medico medicoDown = (Medico) persona1;
Paciente pacienteDown = (Paciente) persona2;
Enfermero enfermeroDown = (Enfermero) persona3;

System.out.println("\nDOWNCASTING:");

System.out.println(
        medicoDown.getEspecialidad()
                  .getNombreEspecialidad()
);

System.out.println(
        pacienteDown.getNombre()
);

System.out.println(
        enfermeroDown.getTurno()
);
    }
}

