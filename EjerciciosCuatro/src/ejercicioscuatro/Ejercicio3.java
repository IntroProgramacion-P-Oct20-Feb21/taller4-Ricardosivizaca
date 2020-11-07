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
public class Ejercicio3 {
     public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
entrada.useLocale(Locale.US);

//Inicio

// declaro las variables
//valordeMinuto, d[0, n]
double valordeminuto;
//minutosConsumidos, i[0, n]
double minutosConsumidos;
//consumoTotal, d[0, n]
double consumoTotal;


//pido los datos por teclado - entradas
//<< "ingrese cuanto cuesta el minuto" 
System.out.println("Ingrese cuanto cuesta el minuto");
//>> costo de el minuto
valordeminuto = entrada.nextDouble();
//<< "ingrese los minutos consumido"
System.out.println("Ingrese los minutos consumidos");
//>> minutos consumido
minutosConsumidos = entrada.nextDouble();

//proceso

consumoTotal = valordeminuto * minutosConsumidos;

//salida
System.out.printf("El precio a pagar " + consumoTotal);
     
//  Fin    

     }
}

