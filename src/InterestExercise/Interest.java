//Programa que calcula el interest anual y muestra el valor de cada año
//Ejercicio Figura 5.6: Interest.java
package InterestExercise;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class Interest {

    public static void main(String[] args) {
        int invest = 1000;
        double interestRate = 0.05;
        double depositAmount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("El total en el año %d es: %,10.2f%n", i + 1, invest
                    * Math.pow((1 + interestRate), i + 1));
        }
    }//End method main
}//End class Interest