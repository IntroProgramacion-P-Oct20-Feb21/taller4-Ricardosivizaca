/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

/**
 *
 * @author reroes
 */
import java.util.Scanner;
import java.util.Locale;
public class Ejercicio4 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
entrada.useLocale(Locale.US);
    
//Inicio

   // declaro las variables
   
   //costoCPU, d[0, n]
   double costoCPU;
   //costoTeclado, d[0, n]
   double costoTeclado;
   //costoMonitor, d[0, n]
   double costoMonitor;
   //costoRaton, d[0, n]
   double costoRaton;   
   //costoTotaldelacomputadora, d[0, n]
   double costoTotaldelacomputadora;

   
//pido los datos por teclado - entradas
//<< "Ingrese el costo de el CPU" 
System.out.println("Ingrese el costo de el CPU");
//>> costoCPU 
costoCPU = entrada.nextDouble();
//<< "Ingrese el costo de el Teclado"
System.out.println("Ingrese el costo de el Teclado");
//>> costoTeclado
costoTeclado = entrada.nextDouble();
//<< "Ingrese el costo de el Monitor"
System.out.println("Ingrese el costo de el Monitor");
//>> costoMonitor
costoMonitor = entrada.nextDouble();
//<< "Ingrese el costo de el Raton"
System.out.println("Ingrese el costo de el Raton");
//>> costoRaton
costoRaton = entrada.nextDouble();

//proceso
costoTotaldelacomputadora = costoCPU + costoTeclado + costoMonitor 
        + costoRaton;

//salida
System.out.printf("Costo total de la computadora " + costoTotaldelacomputadora);
    
  //Fin  
    
    }
}
