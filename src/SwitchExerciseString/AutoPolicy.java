package SwitchExerciseString;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    //constructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public boolean isNoFaultState() {
        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                return true;
            default:
                return false;
        }//End switch
    }//end method isNoFaulState

    public static void mostrarPolitica(AutoPolicy policy) {
        System.out.println("La politica:");
        System.out.printf("%s%d; %s%s %n %s%s%s %n ",
                "Account #: ", policy.getAccountNumber(),
                "Car: ", policy.getMakeAndModel(),
                "Estado: ", policy.getState(),
                (policy.isNoFaultState() ? " ES un estado valido" : " NO es un estado valido"));
    }
}//End class AutoPolicy
