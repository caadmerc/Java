package DateExercise;

/**
 *
 * @author Carlos Merchan Anchundia
 */
public class Date {
    private int day;//Variable de instancia dia
    private int month;//Variable de instancia mes
    private int year;//Variable de instancia año

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    //Metodo que muestra la fecha con formato: day/month/year
    public void displayDate(){
        System.out.println("Fecha: "+day+"/"+month+"/"+year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}//End Class Date
