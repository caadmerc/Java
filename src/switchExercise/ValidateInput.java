// programa que valida el ingreso por teclado
// solo se aceptan numeros Enteros positivos
// Si ingresa -1 la funcion retorna false
// si es un numero entre 0 y 100 retorna true
package SwitchExercise;

import java.util.Scanner;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class ValidateInput {

    private int valor;
    private int valid;
    private int a = 0, b = 0, c = 0, d = 0, f = 0;

    public boolean validate() {
        valid = 0;// variable que me asegura que al volver a ingresar a la funcion se resetee el proceso
        while (valid == 0) {// condicion para ingresar al proceso de validacion
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {// solo ingresa aqui si se ingresa un entero 
                this.valor = in.nextInt();//asigna el entero a la variable de instancia
                if (valor >= 0 && valor <= 100) {//evalua si el valor esta en el rango valido
                    this.valid = 1;// condicion para que el numero sea valido y salir del while

                } else if (valor == -1) {// condicion para salir del proceso
                    return false;
                } else {// si el numero es negativo diferente de -1
                    System.out.println("Valor no valido.....");
                }
            } else {// si no ingresa un entero 
                System.out.println("Valor no valido.....");
            }
        }//End while 
        return true;// retorna true si el valor esta entre 0 y 100
    }//end method validate

    public int getValor() {
        return valor;
    }

    public void calculaNotas() {
        final int NOTAS = 10;

        switch (valor / NOTAS) {
            case 9:
            case 10:
                a++;
                break;
            case 8:
                b++;
                break;
            case 7:
                c++;
                break;
            case 6:
                d++;
                break;
            default:
                f++;
                break;
        }
    }

    //Generar reporte de Calificaciones
    public void generarReporte(int total, int gradeCounter) {
        System.out.println("\t\tReporte General de Calificaciones de la clase");

        if (gradeCounter > 0) {
            System.out.printf("%s%d%n%s%d%n%s%.2f%n",
                    "La cantidad de calificaciones ingresada fue: ", gradeCounter,
                    "La suma total de calificaciones es: ", total,
                    "El promedio de la clase es: ", (double) total / gradeCounter);
            System.out.printf("%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%n",
                    "Total de estudiantes de acuerdo a su calificacion:",
                    "A: ",a,
                    "B: ",b,
                    "C: ",c,
                    "D: ",d,
                    "F: ",f);
        } else {
            System.out.println("No se ha ingresado calificaciones....");
        }
    }//End method generarReporte
}//End class ValidateInput