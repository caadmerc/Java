package SwitchExerciseString;

import sun.security.pkcs11.P11Util;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class AutoPolicyTest {

    public static void main(String[] args) {
        AutoPolicy p1 = new AutoPolicy(11111, "Toyota Camry", "NY");
        AutoPolicy p2 = new AutoPolicy(22222, "Ford Fusion", "NC");
        
        AutoPolicy.mostrarPolitica(p1);
        AutoPolicy.mostrarPolitica(p2);
        
    }//End method main    
    

}//End class AutoPolicyTest
