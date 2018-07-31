package Input;
import java.util.Scanner;

/* Programa que recibe dos parametros ingresados por teclado 
    y Calcula Operaciones basicas
*/

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1,// Numero 1
            n2;// Numero 2
        
        System.out.print("Ingrese el Número 1: ");
        n1=input.nextInt();
        System.out.print("Ingrese el Número 2: ");
        n2=input.nextInt();
        
        System.out.printf("La Suma de los Números %d y %d es: %d%n",n1,n2,(n1+n2));
        System.out.printf("La Resta entre %d y %d es: %d%n",n1,n2,(n1-n2));
        System.out.printf("La Multiplicación es: %d\n",n1*n2);
        System.out.printf("La División es: %d\n",n1/n2);
        System.out.printf("El Módulo es: %d\n",n1%n2);
        
        input.close();
        
    }// End Method Main
}//End Class Ejercicio 2
