package BankConstructor;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class AccountTest {
    public static void main(String[] args){
       Account a1=new Account("Carlos"); // creacion del objeto 1 e inicializandolo
       Account a2=new Account("Marcos"); // creacion del objeto 1 e inicializandolo
       System.out.printf("El nombre Almacenado en el objeto 1 es: %n%s%n",a1.getName());
       System.out.printf("El nombre Almacenado en el objeto 2 es: %n%s%n",a2.getName());        
    }//End Method Main
}//End Class AccountTest
