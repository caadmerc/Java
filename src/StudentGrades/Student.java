package StudentGrades;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class Student {

    private String name;//Variable de instancia nombre
    private double average;//Variable de instancia promedio

    public Student(String name, double average) {
        this.name = name;

        //validacion que el promedio sea mayor a 0.0 y <=100
        if (average > 0.0 && average <= 100) {
            this.average = average;
        }
    }//End Constuctor Student

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        //validacion que el promedio sea mayor a 0.0 y <=100
        if (average > 0.0 && average <= 100) {
            this.average = average;
        }
    }//End Method setAverage

    public String getLetterGrade() {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }//End Method getLetterGrade    
}//End Class Student
