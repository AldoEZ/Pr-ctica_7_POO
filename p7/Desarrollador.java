package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.Empleado;

/**
 * Clase Desarrollador
 * @author Aldo Axel Estrada Zacarias
 * @version 02-Octubre-2024
 */

public class Desarrollador extends Empleado {
    /**
     * Metodo constructor
     * Para construir objetos Desarrollador.
     * @param nombre -> Atributo para asginar nombre.
     * @param direccion -> Atributo para asginar direccion.
     * @param salario -> Atributo para asginar salario.
     * @param nombreTrabajo -> Atributo para asginar nombre de trabajo.
     */
    public Desarrollador(String nombre, String direccion, double salario, String nombreTrabajo) {
        super(nombre, direccion, salario, nombreTrabajo);
    }
    
    /**
     * Metodo mostrarInformacion
     * Sobreescribe metodo mostrarInformacion para el Desarrollador.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("\nInformacion Desarrollador:");
        super.mostrarInformacion();
    }
    
    /**
     * Metodo calcularBonos
     * Calcula el bono para un desarrollador.
     * @param propuestasMejora -> Atributo que indica las propuestas de mejora dadas por un desarrollador.
     */
    @Override
    public void calcularBonos(double propuestasMejora) {
        if(propuestasMejora > 5 && propuestasMejora < 7) {
            System.out.println("\nBono adquirido de 5% por "  + propuestasMejora + " mejoras propuestas por el " 
                                + this.getNombreTrabajo() + ": " + this.getNombre() + ".");
            this.setSalario(this.getSalario() + (this.getSalario() * (0.05)));
        } else if(propuestasMejora <= 9) {
            System.out.println("\nBono adquirido de 10% por "  + propuestasMejora + " mejoras propuestas por el " 
                                + this.getNombreTrabajo() + ": " + this.getNombre() + ".");
            this.setSalario(this.getSalario() + (this.getSalario() * (0.1)));
        } else if(propuestasMejora > 9) {
            System.out.println("\nBono adquirido de 15% por "  + propuestasMejora + " mejoras propuestas por el " 
                                + this.getNombreTrabajo() + ": " + this.getNombre() + ".");
            this.setSalario(this.getSalario() + (this.getSalario() * (0.15)));
        } else {
            super.calcularBonos(propuestasMejora);
        }
        System.out.println("Salario final: " + this.getSalario());
    }
    
    /**
     * Metodo reporteDeDesempenio
     * Valora el desempeño de un Desarrollador.
     * @param resolucionProblemas -> Atributo que indica la cantidad de problemas solucionado.
     * @return String -> Indicando el desempenio del Desarrollador.
     */
    @Override
    public String reporteDeDesempenio(int resolucionProblemas) {
        if(resolucionProblemas < 5) {
            return "\n\tDesempeño bajo: \n\tSe necesita una mayor contribucion al proyecto.\n\tConsejo: Aumentar productividad.\n\n";
        } else if(resolucionProblemas < 10) {
            return "\n\tDesempeño medio: \n\tBuena cantidad de problemas resueltos.\n\tConsejo: Mayor esfuerzo al corregir codigo.\n\n";
        } else {
            return "\n\tDesempeño bueno: Rendimiento excelente. \n\tConseño: Mantener constancia.\n\n";
        }
    }
    
    /**
     * Metodo manejoProyectos
     * Metodo que muestra el avance de un proyecto.
     * @param proyecto -> Atributo que da un nombre al proyecto actual.
     * @param avance -> Atribuo que da un valor porcentual al avance en software del proyecto.
     */
    @Override
    public String manejoProyectos(String proyecto, int avance) {
        return "\nDesarrollo el proyecto: " + proyecto + " y llevamos un avance del " + avance + "% en software.\n";
    }
}
