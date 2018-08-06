package BankConstructor;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class Account {
    private String name;// variable de instancia 
    private double balance;// variable de instancia
    
    // Creacion del constructor
    public Account(String name, double balance) {
        this.name = name;
        
        //valida si el balance es positivo y mayor a 0.0
        if (balance > 0.0) {
            this.balance=balance;
        }
    }
    
    //Metodo que permite depositar dinero 
    public void deposit(double deposit){
        //Valida si la cantidad ingresada es Positiva y mayor a 0.0
        if (deposit > 0.0) {
            balance+=deposit;
        }
    }
    
    //Metodo que retorna el balance de la cuenta
    public double getBalance(){
        return balance;
    }
    
    //Metodo getter    
    public String getName() {
        return name;
    }

    //Metodo Setter
    public void setName(String name) {
        this.name = name;
    }
    
}//End Class Account
