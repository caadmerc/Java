package Bank;

import java.util.Scanner;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account a1 = new Account();
        String name;
        
        //Muestra el valor almacenado en la variable de instancia del objeto Account
        System.out.printf("El nombre por defecto en el Objeto "
                + "Account es:%n%s%n", a1.getName());
        //Recibe un string por teclado, lo almacena en el objeto y lo muestra
        System.out.print("Ingrese el nombre: ");
        a1.setName(name = input.nextLine());
        System.out.printf("El nombre en el objeto Account es:%n%s%n", a1.getName());

        
    }//End Method Main
}//End Class AccountTest
