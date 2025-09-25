/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_poo;

/**
 *
 * @author jimen
 */
public class Empleado {
    // Creamos los atributos de instancia (Encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Creamos el atributo estatico (variable de clase)
    // Es el contadors  global que sera compartido por todas las intancias
    private static int totalEmpleados = 0;
    
    // Creamos una constante para el salario.
    private static final double SALARIO_POR_DEFECTO = 30000.0;
    
    // Creamos los constructores
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        
        // Se incrementa el contador estatico
        Empleado.totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_POR_DEFECTO;
        
        // Se incrementa el contador y se usa como id
        Empleado.totalEmpleados++;
        this.id = Empleado.totalEmpleados;
    }
    
    // Creamos los metodos
    // Metodo sobrecargado( actualizar salario)
    
    //Metodo aumentar salario por porcentaje
    public void actualizarSalario(double porcentaje){
    if (porcentaje > 0){
        this.salario += this.salario * porcentaje;
        System.out.println("Salario actualizado en un " + (porcentaje * 100) + "%.");        
    }
    }
     //Metodo aumentar salario por una cantidad fija
    public void actualizarSalario(int cantidad){
        if (cantidad > 0 ){
            this.salario += cantidad;
            System.out.println("Salario actualizado enun cantidad fija de " + cantidad + ".");
        }
  }
      // Metodo estatico
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    // Metodo de Instancia
    @Override
    public String toString(){
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + 
                ", Salario=" + String.format("%.2f", salario) + "]"; 
    }
    
    // Creamos los Getters y setters (encapsulamiento)
    
    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }
    
    // Setter
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }
}
    
    
