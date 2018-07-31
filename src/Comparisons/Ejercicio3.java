package Comparisons;

import java.util.Scanner;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,//Numero 1
            n2;//Numero 2     

        System.out.print("Ingrese el Numero 1: ");
        n1 = input.nextInt();
        System.out.print("Ingrese el Numero 2: ");
        n2 = input.nextInt();

        if (n1 == n2) 
            System.out.printf("Los Numeros %d y %d son iguales\n", n1, n2);
        
        if (n1 > n2) 
            System.out.printf("El numero %d es mayor a %d\n", n1, n2);
        
        if (n1 < n2) 
            System.out.printf("El numero %d es menor a %d\n", n1, n2);
        
    }//End Method Main
}// End Class Ejercicio3
