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
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
entrada.useLocale(Locale.US);

//Inicio

// declaro las variables
//primerhijo, d[0, n]
double primerhijo;
//segundohijo, d[0, n]
double segundohijo;
//tercerhijo, d[0, n]
double tercerhijo;
//gastostotales, d[0, n]
double gastostotales;

//pido los datos por teclado - entradas
//Ecribir "ingrese el valor de el primer hijo"
System.out.println("ingrese el valor de el promer hijo");
//Ecribir "ingrese el valor de el primer hijo"
primerhijo = entrada.nextDouble();
//>> primer hijo
System.out.println("ingresa el valor de el segundo hijo");
//Escribir "ingrese el valor de el segundo hijo"
segundohijo = entrada.nextDouble();
//>> segundo hijo
System.out.println("ingresa el valor de el tercer hijo");
//Escribir "ingrese el valor de el tercer hijo"
tercerhijo = entrada.nextDouble();
//>> tercer hijo

//proceso
gastostotales = primerhijo + segundohijo + tercerhijo;

//salida
System.out.printf("Gasto total de los hijos " + gastostotales);
   
// Fin    

    }
    
}
