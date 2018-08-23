//Programa que utiliza la sentencia de seleccion multiple (switch) para mostrar las letras
//correspondientes a cada calificacion
package switchExercise;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class LetterGrades {

    public static void main(String[] args) {
        int total = 0;//suma de calificaciones
        int gradeCounter = 0;//contador de calificaciones
        int a = 0, b = 0, c = 0, d = 0, f = 0;// contador de calificaciones de acuerdo a la letra

        System.out.printf("\t\t%s%n\t\t\t%s%n",
                "Ingrese las calificaciones en el rango de 0-100.",
                "Ingrese -1 para salir");

        ValidateInput input1 = new ValidateInput();
        while (input1.validate()) {
            total += input1.getValor();
            ++gradeCounter;

            //calcula las notas segun el rango 0-100
            input1.calculaNotas();
        }//end while
        input1.generarReporte(total, gradeCounter);
    }//End method main
}//End class LetterGrades
