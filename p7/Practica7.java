package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.*;
/**
 * Clase principal de Practica 7
 * @author Estrada Zacarias Aldo Axel
 * @version 03-Octubre-2024
 */

public class Practica7 {
    /**
     * Método main
     * Se ejecuta toda la aplicacion.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Manager manager = new Manager("Andrés Hernández López", "Calle Los Pinos 123, Colonia San Rafael", 30000.0, "Project Manager");
        Desarrollador desarrollador = new Desarrollador("María Fernanda Rodríguez Pérez", "Avenida Libertad 456, Barrio Las Flores", 25000.0, "Desarrollador de Software");
        Programador programador = new Programador("Javier Alejandro Morales Gutiérrez", "Carrera 9 No. 34-56, Sector El Poblado", 20000.0, "Programador");
        
        manager.mostrarInformacion();
        manager.calcularBonos(5.4);
        System.out.print(manager.manejoProyectos("Plataforma de Gestión Empresarial", 60));
        System.out.print(manager.reporteDeDesempenio(8));
        
        desarrollador.mostrarInformacion();
        desarrollador.calcularBonos(8.1);
        System.out.print(desarrollador.manejoProyectos("Aplicación Móvil de E-Commerce", 70));
        System.out.print(desarrollador.reporteDeDesempenio(10));
        
        programador.mostrarInformacion();
        programador.calcularBonos(90.5);
        System.out.print(programador.manejoProyectos("Algoritmo de Búsqueda en Base de Datos", 85));
        System.out.print(programador.reporteDeDesempenio(10));
    }
}
