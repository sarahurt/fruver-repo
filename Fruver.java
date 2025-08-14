//Analisis
/* cantidad de entradas: 2 osea cantidad de bananos(double), cantidad manzanas (double) */
/*salidas: subtotal de manzanas ( double), subtotal de bananos(double), tal sin descuento, total ciondesceunto y de cuanto es el desceunto
 * ejemplo: bananos=1 => cada bannano cuenta 800 es decir que solo paga 800, manzanas => 2 es decir que paga 2000 por la sdos manzanas
 * ya qye cada manzana cuesta 1000
 * total sin desceunto = 800 + 2000 0 2800
 * total con descuento = 2800 + 10%= 2520
 * deceunto del 10% = 280
 */
import java.util.Scanner;

public class Fruver {
    
     public static void main(String[] args) {

        final double PRECIO_BANANO = 800;
        final double PRECIO_MANZANA = 1000;
        final double DESCUENTO = 0.10; 

        Scanner escaner = new Scanner(System.in);

        System.out.println("ingrasa la cantidad de bananos que quieres llevar: ");
        double cantidad_bananos = escaner.nextDouble();
        escaner.nextLine(); //simpre tengo que ponerlo despues de pedir un numero
        System.out.println("ingrasa la cantidad de manzanas que quieres llevar: ");
        double cantidad_manzanas = escaner.nextDouble();
        escaner.nextLine(); 
        double subtotal_manzanas , subtotal_bananos;
        subtotal_bananos = Calcularsubtotal (cantidad_bananos, PRECIO_BANANO);
        subtotal_manzanas = Calcularsubtotal (cantidad_manzanas, PRECIO_MANZANA);

        System.out.println( " el sub total a pagar de bananos es: " + subtotal_bananos);
        System.out.println( "el subtotal a pagar de manzanas es: " + subtotal_manzanas);
       
       totalsinDescuento = calculartotalsindesceuento(subtotal_manzanas, subtotal_bananos);
        System.out.println ("el total sin el descuento es de : " + totalsinDescuento);
     public static double Calcularsubtotal(double cantidad, double precio){
        double subtotal = cantidad * precio;
        return subtotal;
     }
     public static double calculartotalsindesceuento ( double subtotal1, double subtotal2){
      double sumaSubtotales = subtotal1 + subtotal2;
      return sumaSubtotales;
     } 
     public static duble calculardescuento (double totalsindescuento){
      double descuento = totalsindescuento * descuento;
      return descuento;
     }
     public static double calculartotal (double totalsindescuento, double descuento){
       double total = totalsindescuento - descuento;
       return totalsindescuento;
      }
      
     }
   }

