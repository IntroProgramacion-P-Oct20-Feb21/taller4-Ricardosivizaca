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
public class Ejercicio5 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //Inicio
        
        // declaro las variables
        //valorPrestamo, d[0, n]
        double valorPrestamo;
        //valorInteresmensual, i[0, n]
        double valorInteresmensual;
        //plazoDado, i[12]
        int plazoDado=(12);
        //pagoMensual, d[0, n]
        double pagoMensual;
        
        //pido los datos por teclado - entradas
        //<< "Ingrese el valor del prestamo" 
        System.out.println("Ingrese el calor del prestamo");
        //>> valorPrestamo
        valorPrestamo = entrada.nextDouble();
        //<< "Ingrese el valor de interes mensual"
        System.out.println("Ingrese el valor de interes mensual");
        //>> valorInteresmensual
        valorInteresmensual = entrada.nextDouble();
 
        //proceso
        pagoMensual = ((valorPrestamo/plazoDado) + valorInteresmensual);
        
        //salida
        System.out.printf("Pago mensual " + pagoMensual);
                    
//Fin
    
    }
}
