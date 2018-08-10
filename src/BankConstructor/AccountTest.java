package BankConstructor;
import java.util.Scanner;
/**
 *
 * @author Carlos Merchan Anchundia
 */
public class AccountTest {
    public static void main(String[] args){
        //Creacion de dos objetos de tipo Account
        Account a1=new Account("Carlos", -123.22);//Cuenta 1
        Account a2=new Account("Marcos", 590.23);//Cuenta 2
                
        //Muestra el contenido del objeto a1       
        System.out.printf("La cuenta %s Tiene un total de: %.2f%n",a1.getName(),a1.getBalance());        

        //Muestra el contenido del objeto a2
        System.out.printf("La cuenta %s Tiene un total de: %.2f%n",a2.getName(),a2.getBalance());

        // Inicializacion y creacion del Scanner
        Scanner input=new Scanner(System.in);
        
        //Pide el dinero a depositar por teclado en la cuenta 1
        System.out.printf("Ingrese el Dinero a depositar en la Cuenta de %s : ",a1.getName());
        double valor=input.nextDouble();
        
        //Ingresando el valor en la cuenta 1
        System.out.printf("Ingresando el valor de %.2f .............%n",valor);
        a1.deposit(valor);
        
        //Muestra el Balance de la cuenta 1
        System.out.printf("El Balance de la cuenta: %s es: %.2f%n",a1.getName(),a1.getBalance());
        
        //Muestra el Balance de la cuenta 2
        System.out.printf("El Balance de la cuenta: %s es: %.2f%n",a2.getName(),a2.getBalance());
        
        //Pide el dinero a depositar por teclado en la cuenta 2
        System.out.printf("Ingrese el Dinero a depositar en la Cuenta de %s : ",a2.getName());
        valor=input.nextDouble();
        
        //Ingresando el valor en la cuenta 2
        System.out.printf("Ingresando el valor de %.2f .............%n",valor);
        a2.deposit(valor);
        
        //Muestra el Balance de la cuenta 1
        System.out.printf("El Balance de la cuenta: %s es: %.2f%n",a1.getName(),a1.getBalance());
        
        //Muestra el Balance de la cuenta 2
        System.out.printf("El Balance de la cuenta: %s es: %.2f%n",a2.getName(),a2.getBalance());
        
        
    }//End Method Main
}//End Class AccountTest