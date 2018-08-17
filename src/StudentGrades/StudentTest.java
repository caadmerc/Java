package StudentGrades;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student("Carlos", 90.45);
        Student s2 = new Student("Marcos", 74.65);
        
        System.out.printf("Nombre: %s%nLetterGrade: %s%n",
                s1.getName(),s1.getLetterGrade());
        System.out.printf("Nombre: %s%nLetterGrade: %s%n",
                s2.getName(),s2.getLetterGrade());
    }//End method main
}//End class StudentTest
