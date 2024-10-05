package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.Empleado;

/**
 * Clase Programador
 * @author Aldo Axel Estrada Zacarias
 * @version 02-Octubre-2024
 */

public class Programador extends Empleado {
    /**
     * Metodo constructor
     * Para construir objetos Programador.
     * @param nombre -> Atributo para asginar nombre.
     * @param direccion -> Atributo para asginar direccion.
     * @param salario -> Atributo para asginar salario.
     * @param nombreTrabajo -> Atributo para asginar nombre de trabajo.
     */
    public Programador(String nombre, String direccion, double salario, String nombreTrabajo) {
        super(nombre, direccion, salario, nombreTrabajo);
    }
    
    /**
     * Metodo mostrarInformacion
     * Sobreescribe metodo mostrarInformacion para el Programador.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("\nInformacion Programador:");
        super.mostrarInformacion();
    }
    
    /**
     * Metodo calcularBonos
     * Calcula el bono para un programador.
     * @param calidadCodigo -> Atributo que indica la calidad del codigo hecho por un programador.
     */
    @Override
    public void calcularBonos(double calidadCodigo) {
        if(calidadCodigo > 50 && calidadCodigo < 70) {
            System.out.println("\nBono adquirido de 5% por una calidad de codigo del " + calidadCodigo 
                                + "% por el " + this.getNombreTrabajo() + ": " + this.getNombre() + ".");
            this.setSalario(this.getSalario() + (this.getSalario() * (0.05)));
        } else if(calidadCodigo <= 90) {
            System.out.println("\nBono adquirido de 10% por una calidad de codigo del " + calidadCodigo 
                                + "% por el " + this.getNombreTrabajo() + ": " + this.getNombre() + ".");
            this.setSalario(this.getSalario() + (this.getSalario() * (0.1)));
        } else if(calidadCodigo > 90) {
            System.out.println("\nBono adquirido de 15% por una calidad de codigo del " + calidadCodigo 
                                + "% por el " + this.getNombreTrabajo() + ": " + this.getNombre() + ".");
            this.setSalario(this.getSalario() + (this.getSalario() * (0.15)));
        } else {
            super.calcularBonos(calidadCodigo);
        }
        System.out.println("Salario final: " + this.getSalario());
    }
    
    /**
     * Metodo reporteDeDesempenio
     * Valora el desempeño de un Programador.
     * @param resolucionBugs -> Atributo que indica los bugs resueltos.
     * @return String -> Indicando el desempenio del Programador.
     */
    @Override
    public String reporteDeDesempenio(int resolucionBugs) {
        if(resolucionBugs < 5) {
            return "\nDesempeño bajo: \n\tSe necesita una mejor observacion del codigo.\n\tConsejo: Mejorar habilidades de testeo.\n\n";
        } else if(resolucionBugs < 10) {
            return "\nDesempeño medio: \n\tBuena cantidad de bugs resueltos.\n\tConsejo: Mejora habilidades de depuracion.\n\n";
        } else {
            return "\nDesempeño bueno: \n\tRendimiento excelente. \n\tConseño: Mantener constancia en codigo.\n\n";
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
        return "\nProgramo el proyecto: " + proyecto + " y llevo un avance del " + avance + "% en codigo.\n";
    }
}
