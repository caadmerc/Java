package BankConstructor;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class Account {

    private String name;// variable de instancia 

    // Creacion del constructor
    public Account(String name) {
        this.name = name;
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
