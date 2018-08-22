//Programa que pide por teclado las calificaciones de estudiantes, la sentencia de repeticion
// es controlada por una variable sentinela (bandera) ya que el numero de estudiantes se desconoce
package ControlledRepetition;

import java.util.Scanner;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class AverageFlag {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;//Variable local que almacena el total de calificaciones
        int gradeCounter = 0;//variable local que almacena el numero de estudiantes(calificaciones)
        int grade;//variable local que almacena cada calificacion ingresada por el usuario

        System.out.print("Ingrese la calificación o -1 para salir: ");
        grade = input.nextInt();

        //sentencia de repeticion controlada por grade (centinela)
        while (grade != -1) {
            total += grade;
            gradeCounter++;

            System.out.print("Ingrese la calificación o -1 para salir: ");
            grade = input.nextInt();
        }
        
        //valida que e; contador de calificaciones (estudiantes) sea diferente de 0
        if (gradeCounter != 0) {
            System.out.printf("%nEl total de las %d calificaciones ingresadas es: %d%n", gradeCounter, total);
            System.out.printf("El promedio de la clase es: %.2f%n", (double) total / gradeCounter);
        }
        //si no se ingresa ninguna calificacion
        else
            System.out.println("No se ha ingresado ninguna calificación");
    }//End method main
}//End class AverageFlag
