package EmployeeExercise;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class Employee {
    private String firstName;//Variable de Instancia firstName
    private String lastName;//Variable de Instancia lastName
    private double monthlySalary;//Variable de Instancia monthlySalary
    
    //Definicion del Constructor
   public Employee(String firstName, String lastName, double monthlySalary){
       this.firstName=firstName;
       this.lastName=lastName;
       
       //Valida que el salario mensual sea positivo
       if (monthlySalary>0.0) {
           this.monthlySalary=monthlySalary;
       }       
   }//End Constructor Employee

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        //Valida que el salario mensual sea positivo
        if (monthlySalary>0.0) {
            this.monthlySalary = monthlySalary;   
        }        
    }//End Method setMonthlySalary   
}//End Class Employee
