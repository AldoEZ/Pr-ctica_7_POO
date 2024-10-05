package mx.unam.fi.poo.g1.p7;

/**
 * Clase Empleado
 * @author Aldo Axel Estrada Zacarias
 * @version 01-Octubre-2024
 */

public class Empleado {
    private String nombre;
    private String direccion;
    private double salario;
    private String nombreTrabajo;
    
    /**
     * Metodo constructor
     * Para constuir objetos de tipo Empleado
     * @param nombre -> Atributo para asignar nombre al empleado.
     * @param direccion -> Atributo para asignar direccion al empleado.
     * @param salario -> Atributo para asignar salario al empleado.
     * @param nombreTrabajo -> Atributo para asignar nombreTrabajo al empleado.
     */
    public Empleado(String nombre, String direccion, double salario, String nombreTrabajo) {
        setNombre(nombre);
        setDireccion(direccion);
        setSalario(salario);
        setNombreTrabajo(nombreTrabajo);
    }
    
    /**
     * Metodo set
     * @param nombre -> Atributo para asignar un nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo get
     * @return nombre -> Regresa el atributo nombre.
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Metodo set
     * @param direccion -> Atributo que designa una direccion.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo get
     * @return direccion -> Regresa el atributo direccion.
     */
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
     * Metodo set
     * @param salario -> Atributo para asginar un salario.
     */
    public void setSalario(double salario) { 
        this.salario = salario;
    }
    /**
     * Metodo get
     * @return salario -> Regresa el atributo salario.
     */
    public double getSalario() {
        return this.salario;
    }
    
    /**
     * Metodo set
     * @param nombreTrabajo -> Atributo para asignar un nombreTrabajo.
     */
    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }
    /**
     * Metodo get
     * @return nombreTrabajo -> Regresa el atributo nombreTrabajo.
     */
    public String getNombreTrabajo() {
        return this.nombreTrabajo;
    }
    
    /**
     * Metodo calcularBonos
     * Metodo base para dar bonos.
     * @param dato -> Atributo general de datos.
     */
    public void calcularBonos(double dato) {
        System.out.println("Bono no dad, no cumple con los requisitos.");
    }
    
    /**
     * Metodo reporteDeDesempenio
     * Base para dar reportes de desempeño.
     * @param dato -> Atributo general de datos.
     * @return String -> String vacia que indica retorno.
     */
    public String reporteDeDesempenio(int dato) {
        return "";
    }
    
    /**
     * Metodo manejoProyectis
     * Base para mostrar manejo de proyectos.
     * @param proyecto -> Atributo general de proyectos.
     * @param avance -> Atributo general del avance.
     * @return String -> String que indica el avance de un proyecto.
     */
    public String manejoProyectos(String proyecto, int avance) {
        return "\nEl proyecto: " + proyecto + " tiene un avance del " + avance +"%.";
    }
    
    /**
     * Metodo mostrarInformacion
     * Muestra la informacion de un empleado base.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Nombre de Trabajo: " + this.getNombreTrabajo());
    }
}
