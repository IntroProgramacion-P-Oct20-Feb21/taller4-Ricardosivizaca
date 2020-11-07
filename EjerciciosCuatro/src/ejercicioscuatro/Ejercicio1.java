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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // declaro las variables
    Scanner entrada = new Scanner(System.in);
entrada.useLocale(Locale.US);
//base, d[0, n]
double base;
//altura, d[0, n]
double altura;
//area, d[0, n]
double area;

//pido los datos por teclado - entradas
System.out.println("ingresa la base");
//Ecribir "ingrese el valor de la base"
base = entrada.nextDouble();
//>> base
System.out.println("ingresa la altura");
//Escribir "ingrese el valor de la altura"
altura = entrada.nextDouble();
//>> altura

//proceso
area = base * altura/2;

//salida

System.out.printf("El area del triangulo es %.4f\n" ,
        area);       
   
//Fin    

    }
    
}
