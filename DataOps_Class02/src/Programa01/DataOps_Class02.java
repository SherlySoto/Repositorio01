
package Programa01;

import java.util.Scanner;
public class DataOps_Class02 {
    public static void main(String[] args) {
        // Declaración de variables 
        String empleado,cargo;
        double ingreso,gasto,ahorrom,ahorroa;
        // Creando el obejto de lectura
        Scanner lectura= new Scanner(System.in);
        // Entrada de datos
        System.out.print("Nombre de empleado: ");
        empleado=lectura.next();
        System.out.print("Cargo del empleado: ");
        cargo=lectura.next();
        System.out.print("Ingresos del empleado: ");
        ingreso=lectura.nextDouble();
        System.out.print("Gastos del empleado: ");
        gasto=lectura.nextDouble();
        // Proceso de datos
        ahorrom= ingreso-gasto;
        ahorroa=ahorrom*12;
        // Salida de datos
        System.out.println("Ahorro mensual: "+ahorrom);
        System.out.println("Ahorro anual: "+ahorroa);
    }
    
}
