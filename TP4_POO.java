/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_poo;

/**
 *
 * @author jimen
 */
public class TP4_POO {

    public static void main(String[] args) {
        // Imprimimos encabezado
        System.out.println("--- GESTIÓN INICIAL DE EMPLEADOS ---");
        
        // Instanciamos 3 empleados utilizando los contructores
        
        //constructor 2 (Nombre, puesto)
        Empleado emp1 = new Empleado("Daniel Jimenez", "Desarrollador Junior");
        
        // Constructor 1 (ID, nombre, puesto, salario)
        Empleado emp2 = new Empleado (101, "Yulia Seijas", "Gerente de proyectos", 65000.00);
        
        // Constructor 2 verificamos el ID automatico
        Empleado emp3 = new Empleado("Luis Jimenez", "Analista de datos");
        
        // Imprimimos el estado inicial
        System.out.println("\n--- ESTADO INICIAL DE EMPLEADOS ---");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        // Mostramos total de empleados
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        // Probamos el metodo sobrecargado (actualizarSalario)
        System.out.println("\n--- APLICANDO AUMENTOS DE SALARIO ---");
        
         // Sobre carga 1 aumento de porcentaje (15%)
        System.out.print(emp1.getNombre() + ": ");
        emp1.actualizarSalario(0.15); 
        
        //Sobre carga 2 aumento de cantidad fija 3000
        System.out.print(emp2.getNombre() + ": ");
        emp2.actualizarSalario(3000);
        
        // Sobre carga 1 aumento de porcentaje 5%
        System.out.print(emp3.getNombre() + ": ");
        emp3.actualizarSalario(0.05);
        
        // Imprimimos el estado final
        System.out.println("\n--- ESTADO FINAL DE EMPLEADOS ---");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        // verificamos el contador estatico una ultima vez
        System.out.println("\nTotal de empleados al final del programa: " + Empleado.mostrarTotalEmpleados());
    }
    
}
