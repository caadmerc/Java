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
            n2;// Numero 1
        
        System.out.print("Ingrese el Número 1: ");
        n1=input.nextInt();
        System.out.print("Ingrese el numero 2: ");
        n2=input.nextInt();
        
        System.out.printf("La suma de los numeros %d y %d es: %d%n",n1,n2,(n1+n2));
        System.out.printf("La resta entre %d y %d es: %d%n",n1,n2,(n1-n2));
        System.out.printf("La multiplicacion es: %d\n",n1*n2);
        System.out.printf("La division es: %d\n",n1/n2);
        System.out.printf("El Modulo es: %d\n",n1%n2);
        
    }// End Method Main
}//End Class Ejercicio 2
