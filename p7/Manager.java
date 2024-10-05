package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.Empleado;

/**
 * Clase Manager
 * @author Aldo Axel Estrada Zacarias
 * @version 02-Octubre-2024
 */

public class Manager extends Empleado {
    /**
     * Metodo constructor
     * Para construir objetos Manager.
     * @param nombre -> Atributo para asginar nombre.
     * @param direccion -> Atributo para asginar direccion.
     * @param salario -> Atributo para asginar salario.
     * @param nombreTrabajo -> Atributo para asginar nombre de trabajo.
     */
    public Manager(String nombre, String direccion, double salario, String nombreTrabajo) {
        super(nombre, direccion, salario, nombreTrabajo);
    }
    
    /**
     * Metodo mostrarInformacion
     * Sobreescribe metodo mostrarInformacion para el Project Manager
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("\nInformacion Project Manager:");
        super.mostrarInformacion();
    }
    
    /**
     * Metodo calcularBonos
     * Calcula el bono para un project manager.
     * @param satisfaccionCliente -> Atributo que indica la satisfaccion del cliente segun el trabajo del manager.
     */
    @Override
    public void calcularBonos(double satisfaccionCliente) {
        if(satisfaccionCliente > 5 && satisfaccionCliente < 7) {
            System.out.println("\nBono adquirido de 5% por una satisfaccion del cliente media por parte del " 
                                + this.getNombreTrabajo() + ": " + this.getNombre() + ".");
            this.setSalario(this.getSalario() + (this.getSalario() * (0.05)));
        } else if(satisfaccionCliente <= 9) {
            System.out.println("\nBono adquirido de 10% por una satisfaccion del cliente buena por parte del " 
                                + this.getNombreTrabajo() + ": " + this.getNombre() + ".");
            this.setSalario(this.getSalario() + (this.getSalario() * (0.1)));
        } else if(satisfaccionCliente > 9) {
            System.out.println("\nBono adquirido de 15% por una satisfaccion del cliente excelente por parte del " 
                                + this.getNombreTrabajo() + ": " + this.getNombre() + ".");
            this.setSalario(this.getSalario() + (this.getSalario() * (0.15)));
        } else {
            super.calcularBonos(satisfaccionCliente);
        }
        System.out.println("Salario final: " + this.getSalario());
    }
    
    /**
     * Metodo reporteDeDesempenio
     * Valora el desempeño de un Manager.
     * @param objetivosCumplidos -> Atributo que indica la cantidad de objetivos cumplidos.
     * @return String -> Indicando el desempenio del Manager.
     */
    @Override
    public String reporteDeDesempenio(int objetivosCumplidos) {
        if(objetivosCumplidos < 5) {
            return "\nDesempeño bajo: \n\tEs necesario mejorar el rendimiento del equipo.\n\tConsejo: Mayor supervisión.\n\n";
        } else if(objetivosCumplidos < 10) {
            return "\nDesempeño medio: \n\tBuen avance, pero es necesario aumentar el flujo de trabajo.\n\tConsejo: Mayores propuestas.\n\n";
        } else {
            return "\nDesempeño bueno: \n\tFlujo de trabajo ideal, es necesario conservar la constancia.\n\tConseño: Motivación de equipo.\n\n";
        }
    }
    
    /**
     * Metodo manejoProyectos
     * Metodo que muestra el avance de un proyecto.
     * @param proyecto -> Atributo que da un nombre al proyecto actual.
     * @param avance -> Atribuo que da un valor porcentual al avance del proyecto.
     */
    @Override
    public String manejoProyectos(String proyecto, int avance) {
        return "\nSuperviso el proyecto: " + proyecto + " y llevamos un avance del " + avance + "%.\n";
    }
}
