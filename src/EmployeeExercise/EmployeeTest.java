package EmployeeExercise;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee e1=new Employee("Carlos","Merchan",89245.56);//Creacion e inicializacion del empleado1
        Employee e2=new Employee("Marcos","Merchan",168563.23);//Creacion e inicializacion del empleado2
        
        //Muestra el ingreso al año del empleado1
        System.out.printf("El empleado %s tiene un ingreso anual de: %.2f%n",e1.getFirstName(),
                e1.getMonthlySalary());
        
        //Muestra el ingreso al año del empleado2
        System.out.printf("El empleado %s tiene un ingreso anual de: %.2f%n",e2.getFirstName(),
                e2.getMonthlySalary());
        
        System.out.printf("\n\nRealizando Incremento de salarios del 10%% ............\n\n\n");
        
        //Incremento del 10% al salario de los 2 empleados
        e1.setMonthlySalary((e1.getMonthlySalary()*1.10));
        e2.setMonthlySalary((e2.getMonthlySalary()*1.10));
                
        //Muestra el ingreso al año del empleado1 al realizarse el incremento
        System.out.printf("El empleado %s tiene un ingreso anual de: %.2f%n",e1.getFirstName(),
                e1.getMonthlySalary());
        
        //Muestra el ingreso al año del empleado2 al realizarse el incremento
        System.out.printf("El empleado %s tiene un ingreso anual de: %.2f%n",e2.getFirstName(),
                e2.getMonthlySalary());
        
    }//End Method Main    
}//End Class EmployeeTest
