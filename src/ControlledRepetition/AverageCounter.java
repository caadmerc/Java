//Programa que pide por teclado las calificaciones de los 10 estudiantes de una clase, ademas
//la repeticion es controlada por un contador
package ControlledRepetition;

import java.util.Scanner;//importacion de la clase Scanner

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class AverageCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;//Local variable: almacena la suma TOTAL de las calificaciones
        int gradeCounter = 1;//Local variable: el contador de las calificaciones (controla el while)
        int grade;
        while (gradeCounter <= 10) {//El ciclo llegara hasta 10 veces
            System.out.printf("Ingrese la Calificacion %d: ", gradeCounter);
            grade = input.nextInt();
            total += grade;
            gradeCounter++;
        }//End while
        
        //muestra el total de las 10 calificaciones
        System.out.println("Total de las Calificaciones: " + total);
        //muestra el Promedio general de la clase
        System.out.println("Promedio de la clase: " + (double) total / 10);

    }//End Method main
}//End class AverageCounter
